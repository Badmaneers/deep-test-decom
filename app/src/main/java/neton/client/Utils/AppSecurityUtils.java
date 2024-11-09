package neton.client.Utils;

import android.util.Base64;
import com.coloros.neton.BuildConfig;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class AppSecurityUtils {
    public static final String HEX = "0123456789ABCDEF";
    private static String[] binaryArray = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    public static String bytes2BinStr(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(binaryArray[(b & 240) >> 4]);
            sb.append(binaryArray[b & 15]);
        }
        return sb.toString();
    }

    public static String bin2HexStr(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.valueOf(HEX.charAt((bArr[i] & 240) >> 4)) + String.valueOf(HEX.charAt(bArr[i] & 15)));
        }
        return sb.toString();
    }

    public static byte[] hexStr2BinArr(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (((byte) (HEX.indexOf(str.charAt(i2)) << 4)) | ((byte) HEX.indexOf(str.charAt(i2 + 1))));
        }
        return bArr;
    }

    public static String hexStr2BinStr(String str) {
        return bytes2BinStr(hexStr2BinArr(str));
    }

    public static String binToHex(byte[] bArr) {
        if (bArr == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            stringBuffer.append(HEX.charAt((b >> 4) & 15));
            stringBuffer.append(HEX.charAt(b & 15));
        }
        return stringBuffer.toString();
    }

    public static byte[] hexToBin(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static String base64Encode(byte[] bArr) {
        return Base64.encodeToString(bArr, 0);
    }

    public static String base64Decode(String str) {
        return new String(Base64.decode(str, 0), Charset.defaultCharset());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String md5Encode(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.io.UnsupportedEncodingException -> L17 java.security.NoSuchAlgorithmException -> L20
            r1.reset()     // Catch: java.io.UnsupportedEncodingException -> L17 java.security.NoSuchAlgorithmException -> L21
            java.lang.String r0 = "UTF-8"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L17 java.security.NoSuchAlgorithmException -> L21
            r1.update(r6)     // Catch: java.io.UnsupportedEncodingException -> L17 java.security.NoSuchAlgorithmException -> L21
            goto L28
        L17:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "md5 encode error"
            r0.<init>(r1, r6)
            throw r0
        L20:
            r1 = r0
        L21:
            java.io.PrintStream r6 = java.lang.System.err
            java.lang.String r0 = "NoSuchAlgorithmException caught!"
            r6.println(r0)
        L28:
            byte[] r6 = r1.digest()
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L33:
            if (r2 >= r1) goto L5b
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = java.lang.Integer.toHexString(r3)
            int r4 = r4.length()
            r5 = 1
            if (r4 != r5) goto L51
            java.lang.String r4 = "0"
            r0.append(r4)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            goto L58
        L51:
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
        L58:
            int r2 = r2 + 1
            goto L33
        L5b:
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: neton.client.Utils.AppSecurityUtils.md5Encode(java.lang.String):java.lang.String");
    }

    public static String getHmacSHA1(byte[] bArr, String str) {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(str.getBytes("UTF-8"), mac.getAlgorithm()));
            return binToHex(mac.doFinal(bArr));
        } catch (Exception e) {
            throw new RuntimeException("HMAC-SHA1 encode error", e);
        }
    }

    /* loaded from: classes.dex */
    public class ECDSA {
        private static final String KEY_ALGORITHM = "EC";

        /* loaded from: classes.dex */
        public class ECDSAKey {
            private String privateKey;
            private String publicKey;

            public ECDSAKey(String str, String str2) {
                this.publicKey = str;
                this.privateKey = str2;
            }

            public String getPublicKey() {
                return this.publicKey;
            }

            public String getPrivateKey() {
                return this.privateKey;
            }

            public String toString() {
                return "ECDSAKey{publicKey='" + this.publicKey + "', privateKey='" + this.privateKey + "'}";
            }
        }

        public static ECDSAKey genKey(int i) {
            try {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM);
                keyPairGenerator.initialize(i);
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                return new ECDSAKey(AppSecurityUtils.binToHex(generateKeyPair.getPublic().getEncoded()), AppSecurityUtils.binToHex(generateKeyPair.getPrivate().getEncoded()));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public static byte[] sign(byte[] bArr, String str) {
            try {
                PrivateKey generatePrivate = KeyFactory.getInstance(KEY_ALGORITHM).generatePrivate(new PKCS8EncodedKeySpec(AppSecurityUtils.hexToBin(str)));
                Signature signature = Signature.getInstance("SHA1withECDSA");
                signature.initSign(generatePrivate);
                signature.update(bArr);
                return signature.sign();
            } catch (Exception e) {
                throw new RuntimeException("sign with ecdsa error", e);
            }
        }

        public static boolean verify(byte[] bArr, byte[] bArr2, String str) {
            try {
                PublicKey generatePublic = KeyFactory.getInstance(KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(AppSecurityUtils.hexToBin(str)));
                Signature signature = Signature.getInstance("SHA1withECDSA");
                signature.initVerify(generatePublic);
                signature.update(bArr);
                return signature.verify(bArr2);
            } catch (Exception e) {
                throw new RuntimeException("verify sign with ecdsa error", e);
            }
        }
    }

    /* loaded from: classes.dex */
    public class RSA {
        public static final String KEY_ALGORITHM = "RSA";

        /* loaded from: classes.dex */
        public class RSAKey {
            private String privateKey;
            private String publicKey;

            public String getPublicKey() {
                return this.publicKey;
            }

            public void setPublicKey(String str) {
                this.publicKey = str;
            }

            public String getPrivateKey() {
                return this.privateKey;
            }

            public void setPrivateKey(String str) {
                this.privateKey = str;
            }

            public String toString() {
                return "RSAKey{publicKey='" + this.publicKey + "', privateKey='" + this.privateKey + "'}";
            }
        }

        public static byte[] sign(byte[] bArr, String str) {
            try {
                PrivateKey generatePrivate = KeyFactory.getInstance(KEY_ALGORITHM).generatePrivate(new PKCS8EncodedKeySpec(AppSecurityUtils.hexToBin(str)));
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initSign(generatePrivate);
                signature.update(bArr);
                return signature.sign();
            } catch (Exception e) {
                throw new RuntimeException("sign with rsa error", e);
            }
        }

        public static boolean verify(byte[] bArr, byte[] bArr2, String str) {
            try {
                PublicKey generatePublic = KeyFactory.getInstance(KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(AppSecurityUtils.hexToBin(str)));
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(generatePublic);
                signature.update(bArr);
                return signature.verify(bArr2);
            } catch (Exception e) {
                throw new RuntimeException("verify sign with rsa error", e);
            }
        }

        public static byte[] decryptByPrivateKey(byte[] bArr, byte[] bArr2) {
            try {
                PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr2);
                KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
                PrivateKey generatePrivate = keyFactory.generatePrivate(pKCS8EncodedKeySpec);
                Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
                cipher.init(2, generatePrivate);
                return cipher.doFinal(bArr);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public static byte[] decryptByPrivateKey(byte[] bArr, String str) {
            return decryptByPrivateKey(bArr, AppSecurityUtils.hexToBin(str));
        }

        public static byte[] encryptByPublicKey(byte[] bArr, byte[] bArr2) {
            try {
                X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr2);
                KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
                PublicKey generatePublic = keyFactory.generatePublic(x509EncodedKeySpec);
                Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
                cipher.init(1, generatePublic);
                return cipher.doFinal(bArr);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public static byte[] encryptByPublicKey(byte[] bArr, String str) {
            return encryptByPublicKey(bArr, AppSecurityUtils.hexToBin(str));
        }

        public static RSAKey genKey(int i) {
            try {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM);
                keyPairGenerator.initialize(i);
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                PublicKey publicKey = generateKeyPair.getPublic();
                PrivateKey privateKey = generateKeyPair.getPrivate();
                RSAKey rSAKey = new RSAKey();
                rSAKey.setPublicKey(AppSecurityUtils.binToHex(publicKey.getEncoded()));
                rSAKey.setPrivateKey(AppSecurityUtils.binToHex(privateKey.getEncoded()));
                return rSAKey;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public class ThreeDes {
        public static final String algorithm = "DESede";

        /* loaded from: classes.dex */
        public class ECB {
            public static final String ECB = "DESede/ECB/PKCS5Padding";

            public static byte[] decrypt(byte[] bArr, byte[] bArr2) {
                try {
                    Key key = ThreeDes.toKey(bArr2);
                    Cipher cipher = Cipher.getInstance(ECB);
                    cipher.init(2, key);
                    return cipher.doFinal(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            public static byte[] encrypt(byte[] bArr, byte[] bArr2) {
                try {
                    Key key = ThreeDes.toKey(bArr2);
                    Cipher cipher = Cipher.getInstance(ECB);
                    cipher.init(1, key);
                    return cipher.doFinal(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* loaded from: classes.dex */
        public class CBC {
            public static final String CBC = "DESede/CBC/PKCS5Padding";

            public static byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
                try {
                    Key key = ThreeDes.toKey(bArr2);
                    Cipher cipher = Cipher.getInstance(CBC);
                    cipher.init(2, key, new IvParameterSpec(bArr3));
                    return cipher.doFinal(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            public static byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
                try {
                    Key key = ThreeDes.toKey(bArr2);
                    Cipher cipher = Cipher.getInstance(CBC);
                    cipher.init(1, key, new IvParameterSpec(bArr3));
                    return cipher.doFinal(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public static byte[] genKey(int i) {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance(algorithm);
                keyGenerator.init(i);
                return keyGenerator.generateKey().getEncoded();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Key toKey(byte[] bArr) {
            try {
                return SecretKeyFactory.getInstance(algorithm).generateSecret(new DESedeKeySpec(bArr));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public class AES {
        public static byte[] genKey(int i) {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(i);
                return keyGenerator.generateKey().getEncoded();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        /* loaded from: classes.dex */
        public class ECB {
            private static final String ECB = "AES/ECB/PKCS5Padding";

            public static byte[] encrypt(byte[] bArr, byte[] bArr2) {
                try {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                    Cipher cipher = Cipher.getInstance(ECB);
                    cipher.init(1, secretKeySpec);
                    return cipher.doFinal(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            public static byte[] encrypt(byte[] bArr, String str) {
                return encrypt(bArr, AppSecurityUtils.hexToBin(str));
            }

            public static byte[] decrypt(byte[] bArr, byte[] bArr2) {
                try {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                    Cipher cipher = Cipher.getInstance(ECB);
                    cipher.init(2, secretKeySpec);
                    return cipher.doFinal(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            public static byte[] decrypt(byte[] bArr, String str) {
                return decrypt(bArr, AppSecurityUtils.hexToBin(str));
            }
        }

        /* loaded from: classes.dex */
        public class CBC {
            private static final String CBC = "AES/CBC/PKCS5Padding";

            public static byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
                try {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                    Cipher cipher = Cipher.getInstance(CBC);
                    cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                    return cipher.doFinal(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            public static byte[] encrypt(byte[] bArr, String str, byte[] bArr2) {
                return encrypt(bArr, AppSecurityUtils.hexToBin(str), bArr2);
            }

            public static byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
                try {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                    Cipher cipher = Cipher.getInstance(CBC);
                    cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                    return cipher.doFinal(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            public static byte[] decrypt(byte[] bArr, String str, byte[] bArr2) {
                return decrypt(bArr, AppSecurityUtils.hexToBin(str), bArr2);
            }
        }
    }

    public static void main(String[] strArr) {
        System.out.println(getHmacSHA1("我的神啊巴厘岛".getBytes(), "123"));
        ECDSA.ECDSAKey genKey = ECDSA.genKey(256);
        System.out.println("ecdsaKey:".concat(String.valueOf(genKey)));
        System.out.println("ecdsa public key size=" + hexToBin(genKey.getPublicKey()).length);
        System.out.println("ecdsa private key size=" + genKey.getPrivateKey().length());
        byte[] sign = ECDSA.sign("我的神啊巴厘岛".getBytes(), genKey.getPrivateKey());
        System.out.println("ecdsa sign size=" + sign.length + ", hex=" + binToHex(sign));
        System.out.println("ecdsa verify result=".concat(String.valueOf(ECDSA.verify("我的神啊巴厘岛".getBytes(), sign, genKey.getPublicKey()))));
        RSA.RSAKey genKey2 = RSA.genKey(2048);
        System.out.println("rsaKey:".concat(String.valueOf(genKey2)));
        System.out.println("rsa public key size=" + hexToBin(genKey2.getPublicKey()).length);
        System.out.println("rea private key size=" + genKey2.getPrivateKey().length());
        byte[] sign2 = RSA.sign("我的神啊巴厘岛".getBytes(), genKey2.getPrivateKey());
        System.out.println("rsa sign size=" + sign2.length + ", hex=" + binToHex(sign2));
        System.out.println("rsa verify result=".concat(String.valueOf(RSA.verify("我的神啊巴厘岛".getBytes(), sign2, genKey2.getPublicKey()))));
        byte[] decryptByPrivateKey = RSA.decryptByPrivateKey(RSA.encryptByPublicKey("我的神啊巴厘岛".getBytes("UTF-8"), genKey2.getPublicKey()), genKey2.getPrivateKey());
        System.out.println("rsa decrypt data:" + new String(decryptByPrivateKey, "UTF-8"));
        byte[] genKey3 = AES.genKey(128);
        byte[] decrypt = AES.ECB.decrypt(AES.ECB.encrypt("我的神啊巴厘岛".getBytes("UTF-8"), genKey3), genKey3);
        System.out.println("aes ecb decrypt data:" + new String(decrypt, "UTF-8"));
        byte[] genKey4 = AES.genKey(128);
        byte[] bytes = "1234567812345678".getBytes();
        byte[] decrypt2 = AES.CBC.decrypt(AES.CBC.encrypt("我的神啊巴厘岛".getBytes("UTF-8"), genKey4, bytes), genKey4, bytes);
        System.out.println("aes cbc decrypt data:" + new String(decrypt2, "UTF-8"));
        byte[] genKey5 = ThreeDes.genKey(168);
        byte[] decrypt3 = ThreeDes.ECB.decrypt(ThreeDes.ECB.encrypt("我的神啊巴厘岛".getBytes("UTF-8"), genKey5), genKey5);
        System.out.println("ThreeDes ecb decrypt data:" + new String(decrypt3, "UTF-8"));
        byte[] genKey6 = ThreeDes.genKey(168);
        byte[] bytes2 = "12345678".getBytes();
        byte[] decrypt4 = ThreeDes.CBC.decrypt(ThreeDes.CBC.encrypt("我的神啊巴厘岛".getBytes("UTF-8"), genKey6, bytes2), genKey6, bytes2);
        System.out.println("ThreeDes cbc decrypt data:" + new String(decrypt4, "UTF-8"));
    }
}
