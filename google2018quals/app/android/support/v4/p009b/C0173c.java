package android.support.v4.p009b;

import android.content.Context;
import android.os.Process;
import android.support.v4.p010a.C0097b;

public final class C0173c {
    public static int m892a(Context context, String str) {
        return C0173c.m893a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static int m893a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0097b.m395a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0097b.m394a(context, a, str2) != 0 ? -2 : 0;
    }
}
