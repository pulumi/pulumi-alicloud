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
 * ```java
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
 *         var default_ = new Instance(&#34;default&#34;, InstanceArgs.builder()        
 *             .dataphin(&#34;yes&#34;)
 *             .paymentType(&#34;Subscription&#34;)
 *             .period(&#34;1&#34;)
 *             .sdCbool(&#34;yes&#34;)
 *             .sdc(&#34;3&#34;)
 *             .sddpVersion(&#34;version_company&#34;)
 *             .udCbool(&#34;yes&#34;)
 *             .udc(&#34;2000&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Data Security Center Instance can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:sddp/instance:Instance example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:sddp/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Whether the required RAM authorization is configured.
     * 
     */
    @Export(name="authed", type=Boolean.class, parameters={})
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
    @Export(name="dataphin", type=String.class, parameters={})
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
    @Export(name="dataphinCount", type=String.class, parameters={})
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
    @Export(name="instanceNum", type=String.class, parameters={})
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
    @Export(name="logistics", type=String.class, parameters={})
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
    @Export(name="modifyType", type=String.class, parameters={})
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
    @Export(name="odpsSet", type=Boolean.class, parameters={})
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
    @Export(name="ossBucketSet", type=Boolean.class, parameters={})
    private Output<Boolean> ossBucketSet;

    /**
     * @return Whether the authorized oss assets.
     * 
     */
    public Output<Boolean> ossBucketSet() {
        return this.ossBucketSet;
    }
    @Export(name="ossSize", type=String.class, parameters={})
    private Output<String> ossSize;

    public Output<String> ossSize() {
        return this.ossSize;
    }
    /**
     * The payment type of the resource. Valid values: `Subscription`.
     * 
     */
    @Export(name="paymentType", type=String.class, parameters={})
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
    @Export(name="period", type=Integer.class, parameters={})
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
    @Export(name="rdsSet", type=Boolean.class, parameters={})
    private Output<Boolean> rdsSet;

    /**
     * @return Whether the authorized rds assets.
     * 
     */
    public Output<Boolean> rdsSet() {
        return this.rdsSet;
    }
    @Export(name="remainDays", type=String.class, parameters={})
    private Output<String> remainDays;

    public Output<String> remainDays() {
        return this.remainDays;
    }
    /**
     * Automatic renewal period. **NOTE:** The `renew_period` is required under the condition that renewal_status is `AutoRenewal`,
     * 
     */
    @Export(name="renewPeriod", type=Integer.class, parameters={})
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
    @Export(name="renewalStatus", type=String.class, parameters={})
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
    @Export(name="sdCbool", type=String.class, parameters={})
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
    @Export(name="sdc", type=String.class, parameters={})
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
    @Export(name="sddpVersion", type=String.class, parameters={})
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
    @Export(name="status", type=String.class, parameters={})
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
    @Export(name="udCbool", type=String.class, parameters={})
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
    @Export(name="udc", type=String.class, parameters={})
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
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:sddp/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:sddp/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}