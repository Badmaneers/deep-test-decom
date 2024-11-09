package com.google.p066a.p068b;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* compiled from: $Gson$Types.java */
/* renamed from: com.google.a.b.b */
/* loaded from: classes.dex */
public final class C1973b {

    /* renamed from: a */
    static final Type[] f8820a = new Type[0];

    /* renamed from: a */
    private static ParameterizedType m6119a(Type type, Type type2, Type... typeArr) {
        return new C1975d(type, type2, typeArr);
    }

    /* renamed from: f */
    private static GenericArrayType m6132f(Type type) {
        return new C1974c(type);
    }

    /* renamed from: g */
    private static WildcardType m6133g(Type type) {
        return new C1976e(new Type[]{type}, f8820a);
    }

    /* renamed from: h */
    private static WildcardType m6134h(Type type) {
        return new C1976e(new Type[]{Object.class}, new Type[]{type});
    }

    /* renamed from: a */
    public static Type m6120a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C1974c(m6120a((Type) cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C1975d(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C1974c(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C1976e(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* renamed from: b */
    public static Class<?> m6126b(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                C1905a.m6062a(rawType instanceof Class);
                return (Class) rawType;
            }
            if (type instanceof GenericArrayType) {
                return Array.newInstance(m6126b(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            } else {
                throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
            }
        }
        return (Class) type;
    }

    /* renamed from: a */
    public static boolean m6125a(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            } else {
                if (type instanceof WildcardType) {
                    if (!(type2 instanceof WildcardType)) {
                        return false;
                    }
                    WildcardType wildcardType = (WildcardType) type;
                    WildcardType wildcardType2 = (WildcardType) type2;
                    return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                }
                if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            }
        }
        return true;
    }

    /* renamed from: c */
    public static String m6129c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: a */
    private static Type m6122a(Type type, Class<?> cls, Class<?> cls2) {
        Class<?> superclass;
        Type genericSuperclass;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                for (int i = 0; i < length; i++) {
                    if (interfaces[i] == cls2) {
                        return cls.getGenericInterfaces()[i];
                    }
                    if (cls2.isAssignableFrom(interfaces[i])) {
                        genericSuperclass = cls.getGenericInterfaces()[i];
                        superclass = interfaces[i];
                        break;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != Object.class) {
                    superclass = cls.getSuperclass();
                    if (superclass == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(superclass)) {
                        genericSuperclass = cls.getGenericSuperclass();
                        Type type2 = genericSuperclass;
                        cls = superclass;
                        type = type2;
                    } else {
                        cls = superclass;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    /* renamed from: b */
    private static Type m6127b(Type type, Class<?> cls, Class<?> cls2) {
        C1905a.m6062a(cls2.isAssignableFrom(cls));
        return m6123a(type, cls, m6122a(type, cls, cls2));
    }

    /* renamed from: d */
    public static Type m6130d(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* renamed from: a */
    public static Type m6121a(Type type, Class<?> cls) {
        Type m6127b = m6127b(type, cls, Collection.class);
        if (m6127b instanceof WildcardType) {
            m6127b = ((WildcardType) m6127b).getUpperBounds()[0];
        }
        if (m6127b instanceof ParameterizedType) {
            return ((ParameterizedType) m6127b).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: b */
    public static Type[] m6128b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type m6127b = m6127b(type, cls, Map.class);
        if (m6127b instanceof ParameterizedType) {
            return ((ParameterizedType) m6127b).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    /* renamed from: a */
    public static Type m6123a(Type type, Class<?> cls, Type type2) {
        Type m6123a;
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            Type m6124a = m6124a(type, cls, (TypeVariable<?>) typeVariable);
            if (m6124a == typeVariable) {
                return m6124a;
            }
            type2 = m6124a;
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type m6123a2 = m6123a(type, cls, (Type) componentType);
                return componentType == m6123a2 ? cls2 : m6132f(m6123a2);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type m6123a3 = m6123a(type, cls, genericComponentType);
            return genericComponentType == m6123a3 ? genericArrayType : m6132f(m6123a3);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type m6123a4 = m6123a(type, cls, ownerType);
            boolean z = m6123a4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type m6123a5 = m6123a(type, cls, actualTypeArguments[i]);
                if (m6123a5 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = m6123a5;
                }
            }
            return z ? m6119a(m6123a4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (!(type2 instanceof WildcardType)) {
            return type2;
        }
        WildcardType wildcardType = (WildcardType) type2;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length == 1) {
            Type m6123a6 = m6123a(type, cls, lowerBounds[0]);
            if (m6123a6 != lowerBounds[0]) {
                return m6134h(m6123a6);
            }
        } else if (upperBounds.length == 1 && (m6123a = m6123a(type, cls, upperBounds[0])) != upperBounds[0]) {
            return m6133g(m6123a);
        }
        return wildcardType;
    }

    /* renamed from: a */
    private static Type m6124a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> m6118a = m6118a(typeVariable);
        if (m6118a == null) {
            return typeVariable;
        }
        Type m6122a = m6122a(type, cls, m6118a);
        if (!(m6122a instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) m6122a).getActualTypeArguments()[m6117a(m6118a.getTypeParameters(), typeVariable)];
    }

    /* renamed from: a */
    private static int m6117a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private static Class<?> m6118a(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ int m6116a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
