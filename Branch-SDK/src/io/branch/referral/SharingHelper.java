package io.branch.referral;

/**
 * Define the Applications for the sharing the link with.
 * 国外的分享平台
 */
public class SharingHelper {
    /**
     * <p>
     * Defines the Application for sharing a deep link with.
     * </p>
     */
    public enum SHARE_WITH {
        FACEBOOK("com.facebook.katana"),
        TWITTER("com.twitter.android"),
        MESSAGE(".mms"),
        EMAIL("com.google.android.email"),
        FLICKR("com.yahoo.mobile.client.android.flickr"),
        GOOGLE_DOC("com.google.android.apps.docs"),
        WHATS_APP("com.whatsapp");

        private String name = "";

        private SHARE_WITH(String key) {
            this.name = key;
        }

        public String getAppName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
