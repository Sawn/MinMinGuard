package tw.fatminmin.xposed.minminguard.blocker;

import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Created by fatminmin on 2015/10/27.
 */
public abstract class Blocker {
    /**
     *
     * @param packageName
     * @param lpparam
     * @param removeAd
     * @return True if currrent handling app using this adnetwork. False otherwise.
     */
    abstract public boolean handleLoadPackage(final String packageName, XC_LoadPackage.LoadPackageParam lpparam, final boolean removeAd);
    abstract public String getBanner();
    abstract public String getBannerPrefix();
    public String getName() {
        return getClass().getSimpleName();
    }
}



