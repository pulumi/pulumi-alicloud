// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ens.EipInstanceAttachmentArgs;
import com.pulumi.alicloud.ens.inputs.EipInstanceAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Ens Eip Instance Attachment resource.
 * 
 * Bind an EIP to an instance.
 * 
 * For information about Ens Eip Instance Attachment and how to use it, see [What is Eip Instance Attachment](https://www.alibabacloud.com/help/en/).
 * 
 * &gt; **NOTE:** Available since v1.227.0.
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
 * import com.pulumi.alicloud.ens.Instance;
 * import com.pulumi.alicloud.ens.InstanceArgs;
 * import com.pulumi.alicloud.ens.inputs.InstanceSystemDiskArgs;
 * import com.pulumi.alicloud.ens.Eip;
 * import com.pulumi.alicloud.ens.EipArgs;
 * import com.pulumi.alicloud.ens.EipInstanceAttachment;
 * import com.pulumi.alicloud.ens.EipInstanceAttachmentArgs;
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
 *         final var ensRegionId = config.get("ensRegionId").orElse("cn-chenzhou-telecom_unicom_cmcc");
 *         var defaultXKjq1W = new Instance("defaultXKjq1W", InstanceArgs.builder()
 *             .systemDisk(InstanceSystemDiskArgs.builder()
 *                 .size("20")
 *                 .category("cloud_efficiency")
 *                 .build())
 *             .schedulingStrategy("Concentrate")
 *             .scheduleAreaLevel("Region")
 *             .imageId("centos_6_08_64_20G_alibase_20171208")
 *             .paymentType("Subscription")
 *             .instanceType("ens.sn1.stiny")
 *             .password("12345678abcABC")
 *             .status("Running")
 *             .amount("1")
 *             .internetChargeType("95BandwidthByMonth")
 *             .instanceName(name)
 *             .autoUseCoupon("true")
 *             .instanceChargeStrategy("PriceHighPriority")
 *             .ensRegionId(ensRegionId)
 *             .periodUnit("Month")
 *             .build());
 * 
 *         var defaultsGsN4e = new Eip("defaultsGsN4e", EipArgs.builder()
 *             .bandwidth("5")
 *             .eipName(name)
 *             .ensRegionId(ensRegionId)
 *             .internetChargeType("95BandwidthByMonth")
 *             .paymentType("PayAsYouGo")
 *             .build());
 * 
 *         var default_ = new EipInstanceAttachment("default", EipInstanceAttachmentArgs.builder()
 *             .instanceId(defaultXKjq1W.id())
 *             .allocationId(defaultsGsN4e.id())
 *             .instanceType("EnsInstance")
 *             .standby("false")
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
 * Ens Eip Instance Attachment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ens/eipInstanceAttachment:EipInstanceAttachment example &lt;allocation_id&gt;:&lt;instance_id&gt;:&lt;instance_type&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ens/eipInstanceAttachment:EipInstanceAttachment")
public class EipInstanceAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The first ID of the resource
     * 
     */
    @Export(name="allocationId", refs={String.class}, tree="[0]")
    private Output<String> allocationId;

    /**
     * @return The first ID of the resource
     * 
     */
    public Output<String> allocationId() {
        return this.allocationId;
    }
    /**
     * Instance ID
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return Instance ID
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The type of the EIP instance. Value:
     * - `Nat`:NAT gateway.
     * - `SlbInstance`: Server Load Balancer (ELB).
     * - `NetworkInterface`: Secondary ENI.
     * - `EnsInstance` (default): The ENS instance.
     * 
     */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output<String> instanceType;

    /**
     * @return The type of the EIP instance. Value:
     * - `Nat`:NAT gateway.
     * - `SlbInstance`: Server Load Balancer (ELB).
     * - `NetworkInterface`: Secondary ENI.
     * - `EnsInstance` (default): The ENS instance.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * Indicates whether the EIP is a backup EIP. Value:
     * - true: Spare.
     * - false: not standby.
     * 
     */
    @Export(name="standby", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> standby;

    /**
     * @return Indicates whether the EIP is a backup EIP. Value:
     * - true: Spare.
     * - false: not standby.
     * 
     */
    public Output<Optional<Boolean>> standby() {
        return Codegen.optional(this.standby);
    }
    /**
     * The status of the EIP.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the EIP.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EipInstanceAttachment(String name) {
        this(name, EipInstanceAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EipInstanceAttachment(String name, EipInstanceAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EipInstanceAttachment(String name, EipInstanceAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ens/eipInstanceAttachment:EipInstanceAttachment", name, args == null ? EipInstanceAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EipInstanceAttachment(String name, Output<String> id, @Nullable EipInstanceAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ens/eipInstanceAttachment:EipInstanceAttachment", name, state, makeResourceOptions(options, id));
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
    public static EipInstanceAttachment get(String name, Output<String> id, @Nullable EipInstanceAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EipInstanceAttachment(name, id, state, options);
    }
}