// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.EcsKeyPairArgs;
import com.pulumi.alicloud.ecs.inputs.EcsKeyPairState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECS Key Pair resource.
 * 
 * For information about ECS Key Pair and how to use it, see [What is Key Pair](https://www.alibabacloud.com/help/en/doc-detail/51771.htm).
 * 
 * &gt; **NOTE:** Available since v1.121.0.
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
 * import com.pulumi.alicloud.ecs.EcsKeyPair;
 * import com.pulumi.alicloud.ecs.EcsKeyPairArgs;
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
 *         var example = new EcsKeyPair("example", EcsKeyPairArgs.builder()
 *             .keyPairName("key_pair_name")
 *             .build());
 * 
 *         // Using name prefix to build key pair
 *         var prefix = new EcsKeyPair("prefix", EcsKeyPairArgs.builder()
 *             .keyNamePrefix("terraform-test-key-pair-prefix")
 *             .build());
 * 
 *         // Import an existing public key to build a alicloud key pair
 *         var publickey = new EcsKeyPair("publickey", EcsKeyPairArgs.builder()
 *             .keyPairName("my_public_key")
 *             .publicKey("ssh-rsa AAAAB3Nza12345678qwertyuudsfsg")
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
 * ECS Key Pair can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ecs/ecsKeyPair:EcsKeyPair example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/ecsKeyPair:EcsKeyPair")
public class EcsKeyPair extends com.pulumi.resources.CustomResource {
    /**
     * (Available since v1.237.0) The time when the key pair was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return (Available since v1.237.0) The time when the key pair was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The fingerprint of the key pair.
     * 
     */
    @Export(name="fingerPrint", refs={String.class}, tree="[0]")
    private Output<String> fingerPrint;

    /**
     * @return The fingerprint of the key pair.
     * 
     */
    public Output<String> fingerPrint() {
        return this.fingerPrint;
    }
    /**
     * The key file.
     * 
     */
    @Export(name="keyFile", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyFile;

    /**
     * @return The key file.
     * 
     */
    public Output<Optional<String>> keyFile() {
        return Codegen.optional(this.keyFile);
    }
    /**
     * @deprecated
     * Field `key_name` has been deprecated from provider version 1.121.0. New field `key_pair_name` instead.
     * 
     */
    @Deprecated /* Field `key_name` has been deprecated from provider version 1.121.0. New field `key_pair_name` instead. */
    @Export(name="keyName", refs={String.class}, tree="[0]")
    private Output<String> keyName;

    public Output<String> keyName() {
        return this.keyName;
    }
    @Export(name="keyNamePrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyNamePrefix;

    public Output<Optional<String>> keyNamePrefix() {
        return Codegen.optional(this.keyNamePrefix);
    }
    /**
     * The name of the key pair. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * 
     */
    @Export(name="keyPairName", refs={String.class}, tree="[0]")
    private Output<String> keyPairName;

    /**
     * @return The name of the key pair. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * 
     */
    public Output<String> keyPairName() {
        return this.keyPairName;
    }
    /**
     * The public key of the key pair.
     * 
     */
    @Export(name="publicKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> publicKey;

    /**
     * @return The public key of the key pair.
     * 
     */
    public Output<Optional<String>> publicKey() {
        return Codegen.optional(this.publicKey);
    }
    /**
     * The ID of the resource group to which to add the key pair.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group to which to add the key pair.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EcsKeyPair(java.lang.String name) {
        this(name, EcsKeyPairArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EcsKeyPair(java.lang.String name, @Nullable EcsKeyPairArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EcsKeyPair(java.lang.String name, @Nullable EcsKeyPairArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsKeyPair:EcsKeyPair", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EcsKeyPair(java.lang.String name, Output<java.lang.String> id, @Nullable EcsKeyPairState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/ecsKeyPair:EcsKeyPair", name, state, makeResourceOptions(options, id), false);
    }

    private static EcsKeyPairArgs makeArgs(@Nullable EcsKeyPairArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EcsKeyPairArgs.Empty : args;
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
    public static EcsKeyPair get(java.lang.String name, Output<java.lang.String> id, @Nullable EcsKeyPairState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EcsKeyPair(name, id, state, options);
    }
}
