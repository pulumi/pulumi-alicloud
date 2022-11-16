// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ram.AccessKeyArgs;
import com.pulumi.alicloud.ram.inputs.AccessKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a RAM User access key resource.
 * 
 * &gt; **NOTE:**  You should set the `secret_file` if you want to get the access key.
 * 
 * &gt; **NOTE:**  From version 1.98.0, if not set `pgp_key`, the resource will output the access key secret to field `secret` and please protect your backend state file judiciously
 * 
 * ## Example Usage
 * 
 * Output the secret to a file.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.ram.User;
 * import com.pulumi.alicloud.ram.UserArgs;
 * import com.pulumi.alicloud.ram.AccessKey;
 * import com.pulumi.alicloud.ram.AccessKeyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var user = new User(&#34;user&#34;, UserArgs.builder()        
 *             .displayName(&#34;user_display_name&#34;)
 *             .mobile(&#34;86-18688888888&#34;)
 *             .email(&#34;hello.uuu@aaa.com&#34;)
 *             .comments(&#34;yoyoyo&#34;)
 *             .force(true)
 *             .build());
 * 
 *         var ak = new AccessKey(&#34;ak&#34;, AccessKeyArgs.builder()        
 *             .userName(user.name())
 *             .secretFile(&#34;/xxx/xxx/xxx.txt&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Using `pgp_key` to encrypt the secret.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.ram.User;
 * import com.pulumi.alicloud.ram.UserArgs;
 * import com.pulumi.alicloud.ram.AccessKey;
 * import com.pulumi.alicloud.ram.AccessKeyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var user = new User(&#34;user&#34;, UserArgs.builder()        
 *             .displayName(&#34;user_display_name&#34;)
 *             .mobile(&#34;86-18688888888&#34;)
 *             .email(&#34;hello.uuu@aaa.com&#34;)
 *             .comments(&#34;yoyoyo&#34;)
 *             .force(true)
 *             .build());
 * 
 *         var encrypt = new AccessKey(&#34;encrypt&#34;, AccessKeyArgs.builder()        
 *             .userName(user.name())
 *             .pgpKey(&#34;keybase:some_person_that_exists&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;secret&#34;, encrypt.encryptedSecret());
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="alicloud:ram/accessKey:AccessKey")
public class AccessKey extends com.pulumi.resources.CustomResource {
    @Export(name="encryptedSecret", type=String.class, parameters={})
    private Output<String> encryptedSecret;

    public Output<String> encryptedSecret() {
        return this.encryptedSecret;
    }
    /**
     * The fingerprint of the PGP key used to encrypt the secret
     * 
     */
    @Export(name="keyFingerprint", type=String.class, parameters={})
    private Output<String> keyFingerprint;

    /**
     * @return The fingerprint of the PGP key used to encrypt the secret
     * 
     */
    public Output<String> keyFingerprint() {
        return this.keyFingerprint;
    }
    /**
     * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`
     * 
     */
    @Export(name="pgpKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> pgpKey;

    /**
     * @return Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`
     * 
     */
    public Output<Optional<String>> pgpKey() {
        return Codegen.optional(this.pgpKey);
    }
    @Export(name="secret", type=String.class, parameters={})
    private Output<String> secret;

    public Output<String> secret() {
        return this.secret;
    }
    /**
     * The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn&#39;t get its secret ever.
     * 
     */
    @Export(name="secretFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretFile;

    /**
     * @return The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn&#39;t get its secret ever.
     * 
     */
    public Output<Optional<String>> secretFile() {
        return Codegen.optional(this.secretFile);
    }
    /**
     * Status of access key. It must be `Active` or `Inactive`. Default value is `Active`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of access key. It must be `Active` or `Inactive`. Default value is `Active`.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output</* @Nullable */ String> userName;

    /**
     * @return Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<Optional<String>> userName() {
        return Codegen.optional(this.userName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessKey(String name) {
        this(name, AccessKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessKey(String name, @Nullable AccessKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessKey(String name, @Nullable AccessKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/accessKey:AccessKey", name, args == null ? AccessKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessKey(String name, Output<String> id, @Nullable AccessKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/accessKey:AccessKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AccessKey get(String name, Output<String> id, @Nullable AccessKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessKey(name, id, state, options);
    }
}