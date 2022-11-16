// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ram.UserArgs;
import com.pulumi.alicloud.ram.inputs.UserState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.ram.User;
 * import com.pulumi.alicloud.ram.UserArgs;
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
 *             .comments(&#34;yoyoyo&#34;)
 *             .displayName(&#34;user_display_name&#34;)
 *             .email(&#34;hello.uuu@aaa.com&#34;)
 *             .force(true)
 *             .mobile(&#34;86-18688888888&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * RAM user can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ram/user:User example 123456789xxx
 * ```
 * 
 */
@ResourceType(type="alicloud:ram/user:User")
public class User extends com.pulumi.resources.CustomResource {
    /**
     * Comment of the RAM user. This parameter can have a string of 1 to 128 characters.
     * 
     */
    @Export(name="comments", type=String.class, parameters={})
    private Output</* @Nullable */ String> comments;

    /**
     * @return Comment of the RAM user. This parameter can have a string of 1 to 128 characters.
     * 
     */
    public Output<Optional<String>> comments() {
        return Codegen.optional(this.comments);
    }
    /**
     * Name of the RAM user which for display. This name can have a string of 1 to 128 characters or Chinese characters, must contain only alphanumeric characters or Chinese characters or hyphens, such as &#34;-&#34;,&#34;.&#34;, and must not end with a hyphen.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Name of the RAM user which for display. This name can have a string of 1 to 128 characters or Chinese characters, must contain only alphanumeric characters or Chinese characters or hyphens, such as &#34;-&#34;,&#34;.&#34;, and must not end with a hyphen.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Email of the RAM user.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output</* @Nullable */ String> email;

    /**
     * @return Email of the RAM user.
     * 
     */
    public Output<Optional<String>> email() {
        return Codegen.optional(this.email);
    }
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     * 
     */
    @Export(name="force", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return This parameter is used for resource destroy. Default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * Phone number of the RAM user. This number must contain an international area code prefix, just look like this: 86-18600008888.
     * 
     */
    @Export(name="mobile", type=String.class, parameters={})
    private Output</* @Nullable */ String> mobile;

    /**
     * @return Phone number of the RAM user. This number must contain an international area code prefix, just look like this: 86-18600008888.
     * 
     */
    public Output<Optional<String>> mobile() {
        return Codegen.optional(this.mobile);
    }
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, @Nullable UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, @Nullable UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/user:User", name, state, makeResourceOptions(options, id));
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
    public static User get(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}