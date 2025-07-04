// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.hbr.ReplicationVaultArgs;
import com.pulumi.alicloud.hbr.inputs.ReplicationVaultState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Hybrid Backup Recovery (HBR) Replication Vault resource.
 * 
 * The replication vault used by the cross-region backup function of Cloud Backup.
 * 
 * For information about Hybrid Backup Recovery (HBR) Replication Vault and how to use it, see [What is Replication Vault](https://www.alibabacloud.com/help/en/doc-detail/345603.html).
 * 
 * &gt; **NOTE:** Available since v1.252.0.
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
 * import com.pulumi.alicloud.hbr.HbrFunctions;
 * import com.pulumi.alicloud.hbr.inputs.GetReplicationVaultRegionsArgs;
 * import com.pulumi.random.integer;
 * import com.pulumi.random.integerArgs;
 * import com.pulumi.alicloud.hbr.Vault;
 * import com.pulumi.alicloud.hbr.VaultArgs;
 * import com.pulumi.alicloud.hbr.ReplicationVault;
 * import com.pulumi.alicloud.hbr.ReplicationVaultArgs;
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
 *         final var config = ctx.config();
 *         final var sourceRegion = config.get("sourceRegion").orElse("cn-hangzhou");
 *         final var default = HbrFunctions.getReplicationVaultRegions(GetReplicationVaultRegionsArgs.builder()
 *             .build());
 * 
 *         var defaultInteger = new Integer("defaultInteger", IntegerArgs.builder()
 *             .min(10000)
 *             .max(99999)
 *             .build());
 * 
 *         var defaultVault = new Vault("defaultVault", VaultArgs.builder()
 *             .vaultName(String.format("terraform-example-%s", defaultInteger.result()))
 *             .build());
 * 
 *         var defaultReplicationVault = new ReplicationVault("defaultReplicationVault", ReplicationVaultArgs.builder()
 *             .replicationSourceRegionId(sourceRegion)
 *             .replicationSourceVaultId(defaultVault.id())
 *             .vaultName("terraform-example")
 *             .vaultStorageClass("STANDARD")
 *             .description("terraform-example")
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
 * Hybrid Backup Recovery (HBR) Replication Vault can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:hbr/replicationVault:ReplicationVault example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:hbr/replicationVault:ReplicationVault")
public class ReplicationVault extends com.pulumi.resources.CustomResource {
    /**
     * The description of the backup vault.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the backup vault.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The encryption type of the backup vault.
     * 
     */
    @Export(name="encryptType", refs={String.class}, tree="[0]")
    private Output<String> encryptType;

    /**
     * @return The encryption type of the backup vault.
     * 
     */
    public Output<String> encryptType() {
        return this.encryptType;
    }
    /**
     * Alibaba Cloud KMS custom Key or Alias. This parameter is required only when EncryptType = KMS.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return Alibaba Cloud KMS custom Key or Alias. This parameter is required only when EncryptType = KMS.
     * 
     */
    public Output<Optional<String>> kmsKeyId() {
        return Codegen.optional(this.kmsKeyId);
    }
    /**
     * RegionId
     * 
     */
    @Export(name="regionId", refs={String.class}, tree="[0]")
    private Output<String> regionId;

    /**
     * @return RegionId
     * 
     */
    public Output<String> regionId() {
        return this.regionId;
    }
    /**
     * The region ID of the source backup vault.
     * 
     */
    @Export(name="replicationSourceRegionId", refs={String.class}, tree="[0]")
    private Output<String> replicationSourceRegionId;

    /**
     * @return The region ID of the source backup vault.
     * 
     */
    public Output<String> replicationSourceRegionId() {
        return this.replicationSourceRegionId;
    }
    /**
     * The vault ID of the source backup vault.
     * 
     */
    @Export(name="replicationSourceVaultId", refs={String.class}, tree="[0]")
    private Output<String> replicationSourceVaultId;

    /**
     * @return The vault ID of the source backup vault.
     * 
     */
    public Output<String> replicationSourceVaultId() {
        return this.replicationSourceVaultId;
    }
    /**
     * The status of the mirror backup vault.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the mirror backup vault.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The name of the backup vault.
     * 
     */
    @Export(name="vaultName", refs={String.class}, tree="[0]")
    private Output<String> vaultName;

    /**
     * @return The name of the backup vault.
     * 
     */
    public Output<String> vaultName() {
        return this.vaultName;
    }
    /**
     * Backup Vault Storage Class
     * 
     */
    @Export(name="vaultStorageClass", refs={String.class}, tree="[0]")
    private Output<String> vaultStorageClass;

    /**
     * @return Backup Vault Storage Class
     * 
     */
    public Output<String> vaultStorageClass() {
        return this.vaultStorageClass;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationVault(java.lang.String name) {
        this(name, ReplicationVaultArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationVault(java.lang.String name, ReplicationVaultArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationVault(java.lang.String name, ReplicationVaultArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:hbr/replicationVault:ReplicationVault", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ReplicationVault(java.lang.String name, Output<java.lang.String> id, @Nullable ReplicationVaultState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:hbr/replicationVault:ReplicationVault", name, state, makeResourceOptions(options, id), false);
    }

    private static ReplicationVaultArgs makeArgs(ReplicationVaultArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ReplicationVaultArgs.Empty : args;
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
    public static ReplicationVault get(java.lang.String name, Output<java.lang.String> id, @Nullable ReplicationVaultState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationVault(name, id, state, options);
    }
}
