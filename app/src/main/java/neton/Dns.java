package neton;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import neton.client.Utils.LogUtil;

/* loaded from: classes.dex */
public interface Dns {
    public static final Dns SYSTEM = new Dns() { // from class: neton.Dns.1
        @Override // neton.Dns
        public final List<InetAddress> lookup(String str) {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            List<InetAddress> asList = Arrays.asList(InetAddress.getAllByName(str));
            LogUtil.m7844d("Dns---lookup:" + str + ",list:" + asList);
            return asList;
        }
    };

    List<InetAddress> lookup(String str);
}
