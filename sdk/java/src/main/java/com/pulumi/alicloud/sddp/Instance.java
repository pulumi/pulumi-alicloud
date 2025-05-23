// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sddp;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.sddp.InstanceArgs;
import com.pulumi.alicloud.sddp.inputs.InstanceState;
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
 * Provides a Data Security Center Instance resource.
 * 
 * For information about Data Security Center Instance and how to use it, see [What is Instance](https://help.aliyun.com/product/88674.html).
 * 
 * &gt; **NOTE:** Available in v1.136.0+.
 * 
 * &gt; **NOTE:** The Data Security Center Instance is not support in the international site.
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
 * import com.pulumi.alicloud.sddp.Instance;
 * import com.pulumi.alicloud.sddp.InstanceArgs;
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
 *         var default_ = new Instance("default", InstanceArgs.builder()
 *             .paymentType("Subscription")
 *             .sddpVersion("version_company")
 *             .sdCbool("yes")
 *             .period(1)
 *             .sdc("3")
 *             .udCbool("yes")
 *             .udc("2000")
 *             .dataphin("yes")
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
 * Data Security Center Instance can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:sddp/instance:Instance example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:sddp/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Whether the required RAM authorization is configured.
     * 
     */
    @Export(name="authed", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> authed;

    /**
     * @return Whether the required RAM authorization is configured.
     * 
     */
    public Output<Boolean> authed() {
        return this.authed;
    }
    /**
     * The dataphin. Valid values: `yes`,`no`.
     * 
     */
    @Export(name="dataphin", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataphin;

    /**
     * @return The dataphin. Valid values: `yes`,`no`.
     * 
     */
    public Output<Optional<String>> dataphin() {
        return Codegen.optional(this.dataphin);
    }
    /**
     * The dataphin count. Valid values: 1 to 20.
     * 
     */
    @Export(name="dataphinCount", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dataphinCount;

    /**
     * @return The dataphin count. Valid values: 1 to 20.
     * 
     */
    public Output<Optional<String>> dataphinCount() {
        return Codegen.optional(this.dataphinCount);
    }
    /**
     * The number of instances.
     * 
     */
    @Export(name="instanceNum", refs={String.class}, tree="[0]")
    private Output<String> instanceNum;

    /**
     * @return The number of instances.
     * 
     */
    public Output<String> instanceNum() {
        return this.instanceNum;
    }
    /**
     * The logistics.
     * 
     */
    @Export(name="logistics", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> logistics;

    /**
     * @return The logistics.
     * 
     */
    public Output<Optional<String>> logistics() {
        return Codegen.optional(this.logistics);
    }
    /**
     * The modify type. Valid values: `Upgrade`, `Downgrade`.  **NOTE:** The `modify_type` is required when you execute a update operation.
     * 
     */
    @Export(name="modifyType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> modifyType;

    /**
     * @return The modify type. Valid values: `Upgrade`, `Downgrade`.  **NOTE:** The `modify_type` is required when you execute a update operation.
     * 
     */
    public Output<Optional<String>> modifyType() {
        return Codegen.optional(this.modifyType);
    }
    /**
     * Whether the authorized MaxCompute (ODPS) assets.
     * 
     */
    @Export(name="odpsSet", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> odpsSet;

    /**
     * @return Whether the authorized MaxCompute (ODPS) assets.
     * 
     */
    public Output<Boolean> odpsSet() {
        return this.odpsSet;
    }
    /**
     * Whether the authorized oss assets.
     * 
     */
    @Export(name="ossBucketSet", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ossBucketSet;

    /**
     * @return Whether the authorized oss assets.
     * 
     */
    public Output<Boolean> ossBucketSet() {
        return this.ossBucketSet;
    }
    /**
     * The OSS storage capacity.
     * 
     */
    @Export(name="ossSize", refs={String.class}, tree="[0]")
    private Output<String> ossSize;

    /**
     * @return The OSS storage capacity.
     * 
     */
    public Output<String> ossSize() {
        return this.ossSize;
    }
    /**
     * The payment type of the resource. Valid values: `Subscription`.
     * 
     */
    @Export(name="paymentType", refs={String.class}, tree="[0]")
    private Output<String> paymentType;

    /**
     * @return The payment type of the resource. Valid values: `Subscription`.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }
    /**
     * The Prepaid period. Valid values: `1`, `2`, `3`, `6`,`12`,`24`.
     * 
     */
    @Export(name="period", refs={Integer.class}, tree="[0]")
    private Output<Integer> period;

    /**
     * @return The Prepaid period. Valid values: `1`, `2`, `3`, `6`,`12`,`24`.
     * 
     */
    public Output<Integer> period() {
        return this.period;
    }
    /**
     * Whether the authorized rds assets.
     * 
     */
    @Export(name="rdsSet", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> rdsSet;

    /**
     * @return Whether the authorized rds assets.
     * 
     */
    public Output<Boolean> rdsSet() {
        return this.rdsSet;
    }
    /**
     * The remaining days of the protection period of the assets in the current login account.
     * 
     */
    @Export(name="remainDays", refs={String.class}, tree="[0]")
    private Output<String> remainDays;

    /**
     * @return The remaining days of the protection period of the assets in the current login account.
     * 
     */
    public Output<String> remainDays() {
        return this.remainDays;
    }
    /**
     * Automatic renewal period. **NOTE:** The `renew_period` is required under the condition that renewal_status is `AutoRenewal`,
     * 
     */
    @Export(name="renewPeriod", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> renewPeriod;

    /**
     * @return Automatic renewal period. **NOTE:** The `renew_period` is required under the condition that renewal_status is `AutoRenewal`,
     * 
     */
    public Output<Optional<Integer>> renewPeriod() {
        return Codegen.optional(this.renewPeriod);
    }
    /**
     * Automatic renewal status. Valid values: `AutoRenewal`,`ManualRenewal`. Default Value: `ManualRenewal`.
     * 
     */
    @Export(name="renewalStatus", refs={String.class}, tree="[0]")
    private Output<String> renewalStatus;

    /**
     * @return Automatic renewal status. Valid values: `AutoRenewal`,`ManualRenewal`. Default Value: `ManualRenewal`.
     * 
     */
    public Output<String> renewalStatus() {
        return this.renewalStatus;
    }
    /**
     * Whether to use the database. Valid values:`yes`,`no`.
     * 
     */
    @Export(name="sdCbool", refs={String.class}, tree="[0]")
    private Output<String> sdCbool;

    /**
     * @return Whether to use the database. Valid values:`yes`,`no`.
     * 
     */
    public Output<String> sdCbool() {
        return this.sdCbool;
    }
    /**
     * The number of instances.
     * 
     */
    @Export(name="sdc", refs={String.class}, tree="[0]")
    private Output<String> sdc;

    /**
     * @return The number of instances.
     * 
     */
    public Output<String> sdc() {
        return this.sdc;
    }
    /**
     * The sddp version. Valid values: `version_audit`,`version_company`,`version_dlp`.
     * 
     */
    @Export(name="sddpVersion", refs={String.class}, tree="[0]")
    private Output<String> sddpVersion;

    /**
     * @return The sddp version. Valid values: `version_audit`,`version_company`,`version_dlp`.
     * 
     */
    public Output<String> sddpVersion() {
        return this.sddpVersion;
    }
    /**
     * The status of the resource.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Whether to use OSS. Valid values: `yes`,`no`.
     * 
     */
    @Export(name="udCbool", refs={String.class}, tree="[0]")
    private Output<String> udCbool;

    /**
     * @return Whether to use OSS. Valid values: `yes`,`no`.
     * 
     */
    public Output<String> udCbool() {
        return this.udCbool;
    }
    /**
     * OSS Size.
     * 
     */
    @Export(name="udc", refs={String.class}, tree="[0]")
    private Output<String> udc;

    /**
     * @return OSS Size.
     * 
     */
    public Output<String> udc() {
        return this.udc;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(java.lang.String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(java.lang.String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(java.lang.String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:sddp/instance:Instance", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Instance(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:sddp/instance:Instance", name, state, makeResourceOptions(options, id), false);
    }

    private static InstanceArgs makeArgs(InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InstanceArgs.Empty : args;
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
    public static Instance get(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
