// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ens.EipArgs;
import com.pulumi.alicloud.ens.inputs.EipState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ENS Eip resource. Edge elastic public network IP. When you use it for the first time, please contact the product classmates to add a resource whitelist.
 * 
 * For information about ENS Eip and how to use it, see [What is Eip](https://www.alibabacloud.com/help/en/ens/developer-reference/api-createeipinstance).
 * 
 * &gt; **NOTE:** Available since v1.213.0.
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
 * import com.pulumi.alicloud.ens.Eip;
 * import com.pulumi.alicloud.ens.EipArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform-example&#34;);
 *         var default_ = new Eip(&#34;default&#34;, EipArgs.builder()        
 *             .description(&#34;EipDescription_autotest&#34;)
 *             .bandwidth(&#34;5&#34;)
 *             .isp(&#34;cmcc&#34;)
 *             .paymentType(&#34;PayAsYouGo&#34;)
 *             .ensRegionId(&#34;cn-chenzhou-telecom_unicom_cmcc&#34;)
 *             .eipName(name)
 *             .internetChargeType(&#34;95BandwidthByMonth&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ENS Eip can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ens/eip:Eip example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ens/eip:Eip")
public class Eip extends com.pulumi.resources.CustomResource {
    /**
     * The peak bandwidth of the EIP to be specified.Rules:Default value: 5, value range: 5~10000, unit: Mbps. Example value: 5.
     * 
     */
    @Export(name="bandwidth", refs={Integer.class}, tree="[0]")
    private Output<Integer> bandwidth;

    /**
     * @return The peak bandwidth of the EIP to be specified.Rules:Default value: 5, value range: 5~10000, unit: Mbps. Example value: 5.
     * 
     */
    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }
    /**
     * The creation time of the EIP instance.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the EIP instance.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The description of the EIP.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the EIP.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the EIP instance.
     * 
     */
    @Export(name="eipName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eipName;

    /**
     * @return Name of the EIP instance.
     * 
     */
    public Output<Optional<String>> eipName() {
        return Codegen.optional(this.eipName);
    }
    /**
     * Ens node ID.
     * 
     */
    @Export(name="ensRegionId", refs={String.class}, tree="[0]")
    private Output<String> ensRegionId;

    /**
     * @return Ens node ID.
     * 
     */
    public Output<String> ensRegionId() {
        return this.ensRegionId;
    }
    /**
     * Billing type of the EIP instance. Valid value: 95bandwidthbymonth.
     * 
     */
    @Export(name="internetChargeType", refs={String.class}, tree="[0]")
    private Output<String> internetChargeType;

    /**
     * @return Billing type of the EIP instance. Valid value: 95bandwidthbymonth.
     * 
     */
    public Output<String> internetChargeType() {
        return this.internetChargeType;
    }
    /**
     * Internet service provider, if not filled in, it will be assigned according to the default rules.
     * 
     */
    @Export(name="isp", refs={String.class}, tree="[0]")
    private Output<String> isp;

    /**
     * @return Internet service provider, if not filled in, it will be assigned according to the default rules.
     * 
     */
    public Output<String> isp() {
        return this.isp;
    }
    /**
     * The billing type of the EIP instanceValue: PayAsYouGo.
     * 
     */
    @Export(name="paymentType", refs={String.class}, tree="[0]")
    private Output<String> paymentType;

    /**
     * @return The billing type of the EIP instanceValue: PayAsYouGo.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }
    /**
     * The status of the EIP instance.Rules:Associating: bindingUnassociating: UnbindingInUse: AssignedAvailable: AvailableCreating: CreatingReleasing: Releasing.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the EIP instance.Rules:Associating: bindingUnassociating: UnbindingInUse: AssignedAvailable: AvailableCreating: CreatingReleasing: Releasing.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Eip(String name) {
        this(name, EipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Eip(String name, EipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Eip(String name, EipArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ens/eip:Eip", name, args == null ? EipArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Eip(String name, Output<String> id, @Nullable EipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ens/eip:Eip", name, state, makeResourceOptions(options, id));
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
    public static Eip get(String name, Output<String> id, @Nullable EipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Eip(name, id, state, options);
    }
}