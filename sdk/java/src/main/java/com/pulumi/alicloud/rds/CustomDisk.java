// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.rds.CustomDiskArgs;
import com.pulumi.alicloud.rds.inputs.CustomDiskState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a RDS Custom Disk resource.
 * 
 * RDS User dedicated host disk.
 * 
 * For information about RDS Custom Disk and how to use it, see [What is Custom Disk](https://next.api.alibabacloud.com/document/Rds/2014-08-15/CreateRCDisk).
 * 
 * &gt; **NOTE:** Available since v1.247.0.
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
 * import com.pulumi.alicloud.rds.CustomDisk;
 * import com.pulumi.alicloud.rds.CustomDiskArgs;
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
 *         final var name = config.get("name").orElse("terraform-example");
 *         final var regionId = config.get("regionId").orElse("cn-beijing");
 *         var default_ = new CustomDisk("default", CustomDiskArgs.builder()
 *             .description("zcc测试用例")
 *             .zoneId("cn-beijing-i")
 *             .size(40)
 *             .performanceLevel("PL1")
 *             .instanceChargeType("Postpaid")
 *             .diskCategory("cloud_essd")
 *             .diskName("custom_disk_001")
 *             .autoRenew(false)
 *             .period(1)
 *             .autoPay(true)
 *             .periodUnit("1")
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
 * RDS Custom Disk can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:rds/customDisk:CustomDisk example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:rds/customDisk:CustomDisk")
public class CustomDisk extends com.pulumi.resources.CustomResource {
    /**
     * Whether to pay automatically. Value range:
     * 
     */
    @Export(name="autoPay", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoPay;

    /**
     * @return Whether to pay automatically. Value range:
     * 
     */
    public Output<Optional<Boolean>> autoPay() {
        return Codegen.optional(this.autoPay);
    }
    /**
     * Whether to automatically renew. This parameter is passed in only when you create a data disk. Valid values:
     * 
     */
    @Export(name="autoRenew", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoRenew;

    /**
     * @return Whether to automatically renew. This parameter is passed in only when you create a data disk. Valid values:
     * 
     */
    public Output<Optional<Boolean>> autoRenew() {
        return Codegen.optional(this.autoRenew);
    }
    /**
     * Creation time.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Creation time.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The disk description. It must be 2 to 256 characters in length and cannot start with &#39;http:// &#39;or &#39;https.
     * Default value: empty.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The disk description. It must be 2 to 256 characters in length and cannot start with &#39;http:// &#39;or &#39;https.
     * Default value: empty.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The type of the data disk. Value range:
     * 
     */
    @Export(name="diskCategory", refs={String.class}, tree="[0]")
    private Output<String> diskCategory;

    /**
     * @return The type of the data disk. Value range:
     * 
     */
    public Output<String> diskCategory() {
        return this.diskCategory;
    }
    /**
     * The disk name. It can be 2 to 128 characters in length. It supports letters in Unicode (including English, Chinese, and numbers). Can contain a colon (:), an underscore (_), a period (.), or a dash (-).
     * Default value: empty.
     * 
     */
    @Export(name="diskName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> diskName;

    /**
     * @return The disk name. It can be 2 to 128 characters in length. It supports letters in Unicode (including English, Chinese, and numbers). Can contain a colon (:), an underscore (_), a period (.), or a dash (-).
     * Default value: empty.
     * 
     */
    public Output<Optional<String>> diskName() {
        return Codegen.optional(this.diskName);
    }
    /**
     * Whether to pre-check the instance creation operation. Valid values:
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Whether to pre-check the instance creation operation. Valid values:
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The Payment type. Only `Postpaid`: Pay-As-You-Go is supported.
     * 
     */
    @Export(name="instanceChargeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceChargeType;

    /**
     * @return The Payment type. Only `Postpaid`: Pay-As-You-Go is supported.
     * 
     */
    public Output<Optional<String>> instanceChargeType() {
        return Codegen.optional(this.instanceChargeType);
    }
    /**
     * When creating an ESSD cloud disk, set the performance level of the disk. Value range:
     * - `PL0`: The maximum random read/write IOPS 10000 for a single disk.
     * - `PL1` (default): The maximum number of random read/write IOPS 50000 for a single disk.
     * - `PL2`: maximum random read/write IOPS 100000 for a single disk.
     * - `PL3`: The maximum random read/write IOPS 1 million for a single disk.
     * 
     * For more information about how to select an ESSD performance level, see ESSD cloud disk.
     * 
     */
    @Export(name="performanceLevel", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> performanceLevel;

    /**
     * @return When creating an ESSD cloud disk, set the performance level of the disk. Value range:
     * - `PL0`: The maximum random read/write IOPS 10000 for a single disk.
     * - `PL1` (default): The maximum number of random read/write IOPS 50000 for a single disk.
     * - `PL2`: maximum random read/write IOPS 100000 for a single disk.
     * - `PL3`: The maximum random read/write IOPS 1 million for a single disk.
     * 
     * For more information about how to select an ESSD performance level, see ESSD cloud disk.
     * 
     */
    public Output<Optional<String>> performanceLevel() {
        return Codegen.optional(this.performanceLevel);
    }
    /**
     * Reserved parameters, no need to fill in.
     * 
     */
    @Export(name="period", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> period;

    /**
     * @return Reserved parameters, no need to fill in.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * Reserved parameters, no need to fill in.
     * 
     */
    @Export(name="periodUnit", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> periodUnit;

    /**
     * @return Reserved parameters, no need to fill in.
     * 
     */
    public Output<Optional<String>> periodUnit() {
        return Codegen.optional(this.periodUnit);
    }
    /**
     * The region ID. You can view the region ID through the DescribeRegions interface.
     * 
     */
    @Export(name="regionId", refs={String.class}, tree="[0]")
    private Output<String> regionId;

    /**
     * @return The region ID. You can view the region ID through the DescribeRegions interface.
     * 
     */
    public Output<String> regionId() {
        return this.regionId;
    }
    /**
     * The ID of the resource group to which the disk belongs.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group to which the disk belongs.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * Capacity size. Unit: GiB. You must pass in a parameter value for this parameter. Value range:
     * 
     */
    @Export(name="size", refs={Integer.class}, tree="[0]")
    private Output<Integer> size;

    /**
     * @return Capacity size. Unit: GiB. You must pass in a parameter value for this parameter. Value range:
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * The snapshot used to create the cloud disk. Snapshots made on or before July 15, 2013 cannot be used to create cloud disks. The &#39;SnapshotId&#39; parameter and the &#39;Size&#39; parameter have the following limitations:
     * - If the snapshot capacity corresponding to the &#39;SnapshotId&#39; parameter is greater than the set &#39;Size&#39; parameter value, the actual size of the cloud disk created is the size of the specified snapshot.
     * - If the snapshot capacity corresponding to the &#39;SnapshotId&#39; parameter is less than the set &#39;Size&#39; parameter value, the size of the cloud disk created is the specified &#39;Size&#39; parameter value.
     * - Snapshots are not supported for creating elastic temporary disks.
     * 
     */
    @Export(name="snapshotId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> snapshotId;

    /**
     * @return The snapshot used to create the cloud disk. Snapshots made on or before July 15, 2013 cannot be used to create cloud disks. The &#39;SnapshotId&#39; parameter and the &#39;Size&#39; parameter have the following limitations:
     * - If the snapshot capacity corresponding to the &#39;SnapshotId&#39; parameter is greater than the set &#39;Size&#39; parameter value, the actual size of the cloud disk created is the size of the specified snapshot.
     * - If the snapshot capacity corresponding to the &#39;SnapshotId&#39; parameter is less than the set &#39;Size&#39; parameter value, the size of the cloud disk created is the specified &#39;Size&#39; parameter value.
     * - Snapshots are not supported for creating elastic temporary disks.
     * 
     */
    public Output<Optional<String>> snapshotId() {
        return Codegen.optional(this.snapshotId);
    }
    /**
     * Disk status. Value Description:_use: In use.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Disk status. Value Description:_use: In use.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The method of expanding the disk. Value range:
     * offline (default): offline expansion. After the expansion, the instance must be restarted to take effect.
     * online: online expansion, which can be completed without restarting the instance.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return The method of expanding the disk. Value range:
     * offline (default): offline expansion. After the expansion, the instance must be restarted to take effect.
     * online: online expansion, which can be completed without restarting the instance.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * The zone ID.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone ID.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomDisk(java.lang.String name) {
        this(name, CustomDiskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomDisk(java.lang.String name, CustomDiskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomDisk(java.lang.String name, CustomDiskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/customDisk:CustomDisk", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CustomDisk(java.lang.String name, Output<java.lang.String> id, @Nullable CustomDiskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/customDisk:CustomDisk", name, state, makeResourceOptions(options, id), false);
    }

    private static CustomDiskArgs makeArgs(CustomDiskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CustomDiskArgs.Empty : args;
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
    public static CustomDisk get(java.lang.String name, Output<java.lang.String> id, @Nullable CustomDiskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomDisk(name, id, state, options);
    }
}
