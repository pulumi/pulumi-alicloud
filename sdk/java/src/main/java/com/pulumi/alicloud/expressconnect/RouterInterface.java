// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.expressconnect.RouterInterfaceArgs;
import com.pulumi.alicloud.expressconnect.inputs.RouterInterfaceState;
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
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.expressconnect.RouterInterface;
 * import com.pulumi.alicloud.expressconnect.RouterInterfaceArgs;
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
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(var_.name())
 *             .cidrBlock(&#34;10.1.0.0/21&#34;)
 *             .build());
 * 
 *         var defaultRouterInterface = new RouterInterface(&#34;defaultRouterInterface&#34;, RouterInterfaceArgs.builder()        
 *             .description(var_.name())
 *             .oppositeRegionId(&#34;cn-hangzhou&#34;)
 *             .routerId(defaultNetwork.routerId())
 *             .role(&#34;InitiatingSide&#34;)
 *             .routerType(&#34;VRouter&#34;)
 *             .paymentType(&#34;PayAsYouGo&#34;)
 *             .routerInterfaceName(var_.name())
 *             .spec(&#34;Mini.2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Express Connect Router Interface can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:expressconnect/routerInterface:RouterInterface example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:expressconnect/routerInterface:RouterInterface")
public class RouterInterface extends com.pulumi.resources.CustomResource {
    /**
     * The access point ID to which the VBR belongs.
     * 
     */
    @Export(name="accessPointId", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessPointId;

    /**
     * @return The access point ID to which the VBR belongs.
     * 
     */
    public Output<Optional<String>> accessPointId() {
        return Codegen.optional(this.accessPointId);
    }
    /**
     * Whether to pay automatically, value:-**false** (default): automatic payment is not enabled. After generating an order, you need to complete the payment at the order center.-**true**: Enable automatic payment to automatically pay for orders.&gt; **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     * 
     */
    @Export(name="autoPay", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoPay;

    /**
     * @return Whether to pay automatically, value:-**false** (default): automatic payment is not enabled. After generating an order, you need to complete the payment at the order center.-**true**: Enable automatic payment to automatically pay for orders.&gt; **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     * 
     */
    public Output<Optional<Boolean>> autoPay() {
        return Codegen.optional(this.autoPay);
    }
    /**
     * The bandwidth of the resource.
     * 
     */
    @Export(name="bandwidth", type=Integer.class, parameters={})
    private Output<Integer> bandwidth;

    /**
     * @return The bandwidth of the resource.
     * 
     */
    public Output<Integer> bandwidth() {
        return this.bandwidth;
    }
    /**
     * The businessStatus of the resource. Valid Values: `Normal`, `FinancialLocked`, `SecurityLocked`.
     * 
     */
    @Export(name="businessStatus", type=String.class, parameters={})
    private Output<String> businessStatus;

    /**
     * @return The businessStatus of the resource. Valid Values: `Normal`, `FinancialLocked`, `SecurityLocked`.
     * 
     */
    public Output<String> businessStatus() {
        return this.businessStatus;
    }
    /**
     * The connected time of the resource.
     * 
     */
    @Export(name="connectedTime", type=String.class, parameters={})
    private Output<String> connectedTime;

    /**
     * @return The connected time of the resource.
     * 
     */
    public Output<String> connectedTime() {
        return this.connectedTime;
    }
    /**
     * The creation time of the resource.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The cross border of the resource.
     * 
     */
    @Export(name="crossBorder", type=Boolean.class, parameters={})
    private Output<Boolean> crossBorder;

    /**
     * @return The cross border of the resource.
     * 
     */
    public Output<Boolean> crossBorder() {
        return this.crossBorder;
    }
    /**
     * Whether to delete the health check IP address configured on the router interface. Value:-**true**: deletes the health check IP address.-**false** (default): does not delete the health check IP address.
     * 
     */
    @Export(name="deleteHealthCheckIp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteHealthCheckIp;

    /**
     * @return Whether to delete the health check IP address configured on the router interface. Value:-**true**: deletes the health check IP address.-**false** (default): does not delete the health check IP address.
     * 
     */
    public Output<Optional<Boolean>> deleteHealthCheckIp() {
        return Codegen.optional(this.deleteHealthCheckIp);
    }
    /**
     * The description of the router interface. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the router interface. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The end time of the resource.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return The end time of the resource.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * The has reservation data of the resource.
     * 
     */
    @Export(name="hasReservationData", type=String.class, parameters={})
    private Output<String> hasReservationData;

    /**
     * @return The has reservation data of the resource.
     * 
     */
    public Output<String> hasReservationData() {
        return this.hasReservationData;
    }
    /**
     * The health check rate. Unit: seconds. The recommended value is 2. This indicates the interval between successive probe messages sent during the specified health check.
     * 
     */
    @Export(name="hcRate", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> hcRate;

    /**
     * @return The health check rate. Unit: seconds. The recommended value is 2. This indicates the interval between successive probe messages sent during the specified health check.
     * 
     */
    public Output<Optional<Integer>> hcRate() {
        return Codegen.optional(this.hcRate);
    }
    /**
     * The health check thresholds. Unit: pcs. The recommended value is 8. This indicates the number of probe messages to be sent during the specified health check.
     * 
     */
    @Export(name="hcThreshold", type=String.class, parameters={})
    private Output</* @Nullable */ String> hcThreshold;

    /**
     * @return The health check thresholds. Unit: pcs. The recommended value is 8. This indicates the number of probe messages to be sent during the specified health check.
     * 
     */
    public Output<Optional<String>> hcThreshold() {
        return Codegen.optional(this.hcThreshold);
    }
    /**
     * The health check source IP address, must be an unused IP within the local VPC.
     * 
     */
    @Export(name="healthCheckSourceIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthCheckSourceIp;

    /**
     * @return The health check source IP address, must be an unused IP within the local VPC.
     * 
     */
    public Output<Optional<String>> healthCheckSourceIp() {
        return Codegen.optional(this.healthCheckSourceIp);
    }
    /**
     * The IP address for health screening purposes.
     * 
     */
    @Export(name="healthCheckTargetIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthCheckTargetIp;

    /**
     * @return The IP address for health screening purposes.
     * 
     */
    public Output<Optional<String>> healthCheckTargetIp() {
        return Codegen.optional(this.healthCheckTargetIp);
    }
    /**
     * The Access point ID to which the other end belongs.
     * 
     */
    @Export(name="oppositeAccessPointId", type=String.class, parameters={})
    private Output</* @Nullable */ String> oppositeAccessPointId;

    /**
     * @return The Access point ID to which the other end belongs.
     * 
     */
    public Output<Optional<String>> oppositeAccessPointId() {
        return Codegen.optional(this.oppositeAccessPointId);
    }
    /**
     * The opposite bandwidth of the router on the other side.
     * 
     */
    @Export(name="oppositeBandwidth", type=Integer.class, parameters={})
    private Output<Integer> oppositeBandwidth;

    /**
     * @return The opposite bandwidth of the router on the other side.
     * 
     */
    public Output<Integer> oppositeBandwidth() {
        return this.oppositeBandwidth;
    }
    /**
     * The opposite interface business status of the router on the other side. Valid Values: `Normal`, `FinancialLocked`, `SecurityLocked`.
     * 
     */
    @Export(name="oppositeInterfaceBusinessStatus", type=String.class, parameters={})
    private Output<String> oppositeInterfaceBusinessStatus;

    /**
     * @return The opposite interface business status of the router on the other side. Valid Values: `Normal`, `FinancialLocked`, `SecurityLocked`.
     * 
     */
    public Output<String> oppositeInterfaceBusinessStatus() {
        return this.oppositeInterfaceBusinessStatus;
    }
    /**
     * The Interface ID of the router at the other end.
     * 
     */
    @Export(name="oppositeInterfaceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> oppositeInterfaceId;

    /**
     * @return The Interface ID of the router at the other end.
     * 
     */
    public Output<Optional<String>> oppositeInterfaceId() {
        return Codegen.optional(this.oppositeInterfaceId);
    }
    /**
     * The AliCloud account ID of the owner of the router interface on the other end.
     * 
     */
    @Export(name="oppositeInterfaceOwnerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> oppositeInterfaceOwnerId;

    /**
     * @return The AliCloud account ID of the owner of the router interface on the other end.
     * 
     */
    public Output<Optional<String>> oppositeInterfaceOwnerId() {
        return Codegen.optional(this.oppositeInterfaceOwnerId);
    }
    /**
     * The opposite interface spec of the router on the other side. Valid Values: `Mini.2`, `Mini.5`, `Mini.5`, `Small.2`, `Small.5`, `Middle.1`, `Middle.2`, `Middle.5`, `Large.1`, `Large.2`, `Large.5`, `XLarge.1`, `Negative`.
     * 
     */
    @Export(name="oppositeInterfaceSpec", type=String.class, parameters={})
    private Output<String> oppositeInterfaceSpec;

    /**
     * @return The opposite interface spec of the router on the other side. Valid Values: `Mini.2`, `Mini.5`, `Mini.5`, `Small.2`, `Small.5`, `Middle.1`, `Middle.2`, `Middle.5`, `Large.1`, `Large.2`, `Large.5`, `XLarge.1`, `Negative`.
     * 
     */
    public Output<String> oppositeInterfaceSpec() {
        return this.oppositeInterfaceSpec;
    }
    /**
     * The opposite interface status of the router on the other side. Valid Values: `Idle`, `AcceptingConnecting`, `Connecting`, `Activating`, `Active`, `Modifying`, `Deactivating`, `Inactive`, `Deleting`.
     * 
     */
    @Export(name="oppositeInterfaceStatus", type=String.class, parameters={})
    private Output<String> oppositeInterfaceStatus;

    /**
     * @return The opposite interface status of the router on the other side. Valid Values: `Idle`, `AcceptingConnecting`, `Connecting`, `Activating`, `Active`, `Modifying`, `Deactivating`, `Inactive`, `Deleting`.
     * 
     */
    public Output<String> oppositeInterfaceStatus() {
        return this.oppositeInterfaceStatus;
    }
    /**
     * The geographical ID of the location of the receiving end of the connection.
     * 
     */
    @Export(name="oppositeRegionId", type=String.class, parameters={})
    private Output<String> oppositeRegionId;

    /**
     * @return The geographical ID of the location of the receiving end of the connection.
     * 
     */
    public Output<String> oppositeRegionId() {
        return this.oppositeRegionId;
    }
    /**
     * The id of the router at the other end.
     * 
     */
    @Export(name="oppositeRouterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> oppositeRouterId;

    /**
     * @return The id of the router at the other end.
     * 
     */
    public Output<Optional<String>> oppositeRouterId() {
        return Codegen.optional(this.oppositeRouterId);
    }
    /**
     * The opposite router type of the router on the other side. Valid Values: `VRouter`, `VBR`.
     * 
     */
    @Export(name="oppositeRouterType", type=String.class, parameters={})
    private Output<String> oppositeRouterType;

    /**
     * @return The opposite router type of the router on the other side. Valid Values: `VRouter`, `VBR`.
     * 
     */
    public Output<String> oppositeRouterType() {
        return this.oppositeRouterType;
    }
    /**
     * The opposite vpc instance id of the router on the other side.
     * 
     */
    @Export(name="oppositeVpcInstanceId", type=String.class, parameters={})
    private Output<String> oppositeVpcInstanceId;

    /**
     * @return The opposite vpc instance id of the router on the other side.
     * 
     */
    public Output<String> oppositeVpcInstanceId() {
        return this.oppositeVpcInstanceId;
    }
    /**
     * The payment methods for router interfaces. Valid Values: `PayAsYouGo`, `Subscription`.
     * 
     */
    @Export(name="paymentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> paymentType;

    /**
     * @return The payment methods for router interfaces. Valid Values: `PayAsYouGo`, `Subscription`.
     * 
     */
    public Output<Optional<String>> paymentType() {
        return Codegen.optional(this.paymentType);
    }
    /**
     * Purchase duration, value:-When you choose to pay on a monthly basis, the value range is **1 to 9 * *.-When you choose to pay per year, the value range is **1 to 3 * *.&gt; **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     * 
     */
    @Export(name="period", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> period;

    /**
     * @return Purchase duration, value:-When you choose to pay on a monthly basis, the value range is **1 to 9 * *.-When you choose to pay per year, the value range is **1 to 3 * *.&gt; **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * The billing cycle of the prepaid fee. Valid values:-**Month** (default): monthly payment.-**Year**: Pay per Year.&gt; **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     * 
     */
    @Export(name="pricingCycle", type=String.class, parameters={})
    private Output</* @Nullable */ String> pricingCycle;

    /**
     * @return The billing cycle of the prepaid fee. Valid values:-**Month** (default): monthly payment.-**Year**: Pay per Year.&gt; **InstanceChargeType** is required when the value of the parameter is **PrePaid.
     * 
     */
    public Output<Optional<String>> pricingCycle() {
        return Codegen.optional(this.pricingCycle);
    }
    /**
     * The reservation active time of the resource.
     * 
     */
    @Export(name="reservationActiveTime", type=String.class, parameters={})
    private Output<String> reservationActiveTime;

    /**
     * @return The reservation active time of the resource.
     * 
     */
    public Output<String> reservationActiveTime() {
        return this.reservationActiveTime;
    }
    /**
     * The reservation bandwidth of the resource.
     * 
     */
    @Export(name="reservationBandwidth", type=String.class, parameters={})
    private Output<String> reservationBandwidth;

    /**
     * @return The reservation bandwidth of the resource.
     * 
     */
    public Output<String> reservationBandwidth() {
        return this.reservationBandwidth;
    }
    /**
     * The reservation internet charge type of the resource.
     * 
     */
    @Export(name="reservationInternetChargeType", type=String.class, parameters={})
    private Output<String> reservationInternetChargeType;

    /**
     * @return The reservation internet charge type of the resource.
     * 
     */
    public Output<String> reservationInternetChargeType() {
        return this.reservationInternetChargeType;
    }
    /**
     * The reservation order type of the resource.
     * 
     */
    @Export(name="reservationOrderType", type=String.class, parameters={})
    private Output<String> reservationOrderType;

    /**
     * @return The reservation order type of the resource.
     * 
     */
    public Output<String> reservationOrderType() {
        return this.reservationOrderType;
    }
    /**
     * The role of the router interface. Valid Values: `InitiatingSide`, `AcceptingSide`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role of the router interface. Valid Values: `InitiatingSide`, `AcceptingSide`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * The router id associated with the router interface.
     * 
     */
    @Export(name="routerId", type=String.class, parameters={})
    private Output<String> routerId;

    /**
     * @return The router id associated with the router interface.
     * 
     */
    public Output<String> routerId() {
        return this.routerId;
    }
    /**
     * The first ID of the resource.
     * 
     */
    @Export(name="routerInterfaceId", type=String.class, parameters={})
    private Output<String> routerInterfaceId;

    /**
     * @return The first ID of the resource.
     * 
     */
    public Output<String> routerInterfaceId() {
        return this.routerInterfaceId;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="routerInterfaceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> routerInterfaceName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<Optional<String>> routerInterfaceName() {
        return Codegen.optional(this.routerInterfaceName);
    }
    /**
     * The type of router associated with the router interface. Valid Values: `VRouter`, `VBR`.
     * 
     */
    @Export(name="routerType", type=String.class, parameters={})
    private Output<String> routerType;

    /**
     * @return The type of router associated with the router interface. Valid Values: `VRouter`, `VBR`.
     * 
     */
    public Output<String> routerType() {
        return this.routerType;
    }
    /**
     * The specification of the router interface. Valid Values: `Mini.2`, `Mini.5`, `Mini.5`, `Small.2`, `Small.5`, `Middle.1`, `Middle.2`, `Middle.5`, `Large.1`, `Large.2`, `Large.5`, `XLarge.1`, `Negative`.
     * 
     */
    @Export(name="spec", type=String.class, parameters={})
    private Output<String> spec;

    /**
     * @return The specification of the router interface. Valid Values: `Mini.2`, `Mini.5`, `Mini.5`, `Small.2`, `Small.5`, `Middle.1`, `Middle.2`, `Middle.5`, `Large.1`, `Large.2`, `Large.5`, `XLarge.1`, `Negative`.
     * 
     */
    public Output<String> spec() {
        return this.spec;
    }
    /**
     * The status of the resource. Valid Values: `Idle`, `AcceptingConnecting`, `Connecting`, `Activating`, `Active`, `Modifying`, `Deactivating`, `Inactive`, `Deleting`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the resource. Valid Values: `Idle`, `AcceptingConnecting`, `Connecting`, `Activating`, `Active`, `Modifying`, `Deactivating`, `Inactive`, `Deleting`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The vpc instance id of the resource.
     * 
     */
    @Export(name="vpcInstanceId", type=String.class, parameters={})
    private Output<String> vpcInstanceId;

    /**
     * @return The vpc instance id of the resource.
     * 
     */
    public Output<String> vpcInstanceId() {
        return this.vpcInstanceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouterInterface(String name) {
        this(name, RouterInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouterInterface(String name, RouterInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouterInterface(String name, RouterInterfaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:expressconnect/routerInterface:RouterInterface", name, args == null ? RouterInterfaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RouterInterface(String name, Output<String> id, @Nullable RouterInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:expressconnect/routerInterface:RouterInterface", name, state, makeResourceOptions(options, id));
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
    public static RouterInterface get(String name, Output<String> id, @Nullable RouterInterfaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouterInterface(name, id, state, options);
    }
}