// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ram.LoginProfileArgs;
import com.pulumi.alicloud.ram.inputs.LoginProfileState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a RAM User Login Profile resource.
 * 
 * For information about RAM User Login Profile and how to use it, see [What is Login Profile](https://www.alibabacloud.com/help/en/ram/developer-reference/api-ram-2015-05-01-createloginprofile).
 * 
 * &gt; **NOTE:** Available since v1.0.0.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.ram.User;
 * import com.pulumi.alicloud.ram.UserArgs;
 * import com.pulumi.alicloud.ram.LoginProfile;
 * import com.pulumi.alicloud.ram.LoginProfileArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var user = new User("user", UserArgs.builder()
 *             .name("terraform_example")
 *             .displayName("terraform_example")
 *             .mobile("86-18688888888")
 *             .email("hello.uuu}{@literal @}{@code aaa.com")
 *             .comments("terraform_example")
 *             .force(true)
 *             .build());
 * 
 *         var profile = new LoginProfile("profile", LoginProfileArgs.builder()
 *             .userName(user.name())
 *             .password("Example_1234")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * RAM login profile can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ram/loginProfile:LoginProfile example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ram/loginProfile:LoginProfile")
public class LoginProfile extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether an MFA device must be attached to the RAM user upon logon. Valid values: `true`, `false`. [To enhance the security of your resources and data, the default value has been changed to `true`](https://www.alibabacloud.com/en/notice/mfa20240524?_p_lc=1) .
     * 
     */
    @Export(name="mfaBindRequired", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> mfaBindRequired;

    /**
     * @return Specifies whether an MFA device must be attached to the RAM user upon logon. Valid values: `true`, `false`. [To enhance the security of your resources and data, the default value has been changed to `true`](https://www.alibabacloud.com/en/notice/mfa20240524?_p_lc=1) .
     * 
     */
    public Output<Boolean> mfaBindRequired() {
        return this.mfaBindRequired;
    }
    /**
     * The logon password of the RAM user. The password must meet the password strength requirements.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return The logon password of the RAM user. The password must meet the password strength requirements.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Specifies whether the RAM user must change the password upon logon. Default value: `false`. Valid values: `true`, `false`.
     * 
     */
    @Export(name="passwordResetRequired", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> passwordResetRequired;

    /**
     * @return Specifies whether the RAM user must change the password upon logon. Default value: `false`. Valid values: `true`, `false`.
     * 
     */
    public Output<Optional<Boolean>> passwordResetRequired() {
        return Codegen.optional(this.passwordResetRequired);
    }
    /**
     * The name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output<String> userName;

    /**
     * @return The name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoginProfile(java.lang.String name) {
        this(name, LoginProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoginProfile(java.lang.String name, LoginProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoginProfile(java.lang.String name, LoginProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/loginProfile:LoginProfile", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LoginProfile(java.lang.String name, Output<java.lang.String> id, @Nullable LoginProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/loginProfile:LoginProfile", name, state, makeResourceOptions(options, id), false);
    }

    private static LoginProfileArgs makeArgs(LoginProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LoginProfileArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
            ))
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
    public static LoginProfile get(java.lang.String name, Output<java.lang.String> id, @Nullable LoginProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoginProfile(name, id, state, options);
    }
}
