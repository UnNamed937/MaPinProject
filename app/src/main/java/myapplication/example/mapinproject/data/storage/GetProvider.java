package myapplication.example.mapinproject.data.storage;

import android.net.Uri;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;

public class GetProvider {
    private String uid;

    public String getProviderData() {
        // [START get_provider_data]
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            for (UserInfo profile : user.getProviderData()) {
                // Id of the provider (ex: google.com)
                String providerId = profile.getProviderId();

                // UID specific to the provider
                uid = profile.getUid();

                // Name, email address, and profile photo Url
                String name = profile.getDisplayName();
                String email = profile.getEmail();
                Uri photoUrl = profile.getPhotoUrl();
            }
        }
        // [END get_provider_data]

        return uid;
    }

}
//package myapplication.example.mapinproject.data.storage;
//
//        import android.net.Uri;
//
//        import com.google.firebase.auth.FirebaseAuth;
//        import com.google.firebase.auth.FirebaseUser;
//        import com.google.firebase.auth.UserInfo;
//
//public class GetProvider {
//    private String uid;
//
//    public String getProviderData() {
//        // [START get_provider_data]
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//        if (user != null) {
//            for (UserInfo profile : user.getProviderData()) {
//                // Id of the provider (ex: google.com)
//                String providerId = profile.getProviderId();
//
//                // UID specific to the provider
//                uid = profile.getUid();
//                System.out.println(uid);
//                // Name, email address, and profile photo Url
//                String name = profile.getDisplayName();
//                String email = profile.getEmail();
//                Uri photoUrl = profile.getPhotoUrl();
//            }
//        }
//        // [END get_provider_data]
//
//        return uid;
//    }
//
//}