// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.kms.KeyVersionArgs;
import com.pulumi.alicloud.kms.inputs.KeyVersionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Alikms Key Version resource. For information about Alikms Key Version and how to use it, see [What is Resource Alikms Key Version](https://www.alibabacloud.com/help/doc-detail/133838.htm).
 * 
 * &gt; **NOTE:** Available in v1.85.0+.
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
 * import com.pulumi.alicloud.kms.Key;
 * import com.pulumi.alicloud.kms.KeyVersion;
 * import com.pulumi.alicloud.kms.KeyVersionArgs;
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
 *         var this_ = new Key("this");
 * 
 *         var keyversion = new KeyVersion("keyversion", KeyVersionArgs.builder()
 *             .keyId(this_.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Alikms key version can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:kms/keyVersion:KeyVersion example 72da539a-2fa8-4f2d-b854-*****
 * ```
 * 
 */
@ResourceType(type="alicloud:kms/keyVersion:KeyVersion")
public class KeyVersion extends com.pulumi.resources.CustomResource {
    /**
     * The id of the master key (CMK).
     * 
     * &gt; **NOTE:** The minimum interval for creating a Alikms key version is 7 days.
     * 
     */
    @Export(name="keyId", refs={String.class}, tree="[0]")
    private Output<String> keyId;

    /**
     * @return The id of the master key (CMK).
     * 
     * &gt; **NOTE:** The minimum interval for creating a Alikms key version is 7 days.
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }
    /**
     * The id of the Alikms key version.
     * 
     */
    @Export(name="keyVersionId", refs={String.class}, tree="[0]")
    private Output<String> keyVersionId;

    /**
     * @return The id of the Alikms key version.
     * 
     */
    public Output<String> keyVersionId() {
        return this.keyVersionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KeyVersion(java.lang.String name) {
        this(name, KeyVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeyVersion(java.lang.String name, KeyVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeyVersion(java.lang.String name, KeyVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:kms/keyVersion:KeyVersion", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private KeyVersion(java.lang.String name, Output<java.lang.String> id, @Nullable KeyVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:kms/keyVersion:KeyVersion", name, state, makeResourceOptions(options, id), false);
    }

    private static KeyVersionArgs makeArgs(KeyVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? KeyVersionArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static KeyVersion get(java.lang.String name, Output<java.lang.String> id, @Nullable KeyVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KeyVersion(name, id, state, options);
    }
}
