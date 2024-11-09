package com.color.support.util;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.provider.Settings;
import java.util.HashMap;

/* compiled from: ColorSoundLoadUtil.java */
/* renamed from: com.color.support.util.j */
/* loaded from: classes.dex */
public final class C1345j {

    /* renamed from: a */
    private static C1345j f5823a;

    /* renamed from: b */
    private HashMap<Integer, Integer> f5824b = new HashMap<>();

    /* renamed from: c */
    private SoundPool f5825c;

    private C1345j() {
        SoundPool.Builder builder = new SoundPool.Builder();
        AudioAttributes build = new AudioAttributes.Builder().setLegacyStreamType(1).build();
        builder.setMaxStreams(1);
        builder.setAudioAttributes(build);
        this.f5825c = builder.build();
    }

    /* renamed from: a */
    public static synchronized C1345j m4401a() {
        C1345j c1345j;
        synchronized (C1345j.class) {
            if (f5823a == null) {
                f5823a = new C1345j();
            }
            c1345j = f5823a;
        }
        return c1345j;
    }

    /* renamed from: a */
    public final int m4402a(Context context, int i) {
        if (this.f5824b.containsKey(Integer.valueOf(i))) {
            return this.f5824b.get(Integer.valueOf(i)).intValue();
        }
        int load = this.f5825c.load(context, i, 0);
        this.f5824b.put(Integer.valueOf(i), Integer.valueOf(load));
        return load;
    }

    /* renamed from: b */
    public final void m4403b(Context context, int i) {
        if (Settings.System.getInt(context.getContentResolver(), "sound_effects_enabled", 0) != 0) {
            this.f5825c.play(i, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }
}
