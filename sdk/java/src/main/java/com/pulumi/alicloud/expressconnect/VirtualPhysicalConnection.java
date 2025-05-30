// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.expressconnect.VirtualPhysicalConnectionArgs;
import com.pulumi.alicloud.expressconnect.inputs.VirtualPhysicalConnectionState;
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
 * Provides a Express Connect Virtual Physical Connection resource.
 * 
 * For information about Express Connect Virtual Physical Connection and how to use it, see [What is Virtual Physical Connection](https://www.alibabacloud.com/help/en/express-connect/latest/createvirtualphysicalconnection#doc-api-Vpc-CreateVirtualPhysicalConnection).
 * 
 * &gt; **NOTE:** Available since v1.196.0.
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
 * import com.pulumi.alicloud.expressconnect.ExpressconnectFunctions;
 * import com.pulumi.alicloud.expressconnect.inputs.GetPhysicalConnectionsArgs;
 * import com.pulumi.random.integer;
 * import com.pulumi.random.integerArgs;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.expressconnect.VirtualPhysicalConnection;
 * import com.pulumi.alicloud.expressconnect.VirtualPhysicalConnectionArgs;
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
 *         final var name = config.get("name").orElse("tf-example");
 *         final var example = ExpressconnectFunctions.getPhysicalConnections(GetPhysicalConnectionsArgs.builder()
 *             .nameRegex("^preserved-NODELETING")
 *             .build());
 * 
 *         var vlanId = new Integer("vlanId", IntegerArgs.builder()
 *             .max(2999)
 *             .min(1)
 *             .build());
 * 
 *         final var default = AlicloudFunctions.getAccount(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var exampleVirtualPhysicalConnection = new VirtualPhysicalConnection("exampleVirtualPhysicalConnection", VirtualPhysicalConnectionArgs.builder()
 *             .virtualPhysicalConnectionName(name)
 *             .description(name)
 *             .orderMode("PayByPhysicalConnectionOwner")
 *             .parentPhysicalConnectionId(example.ids()[0])
 *             .spec("50M")
 *             .vlanId(vlanId.id())
 *             .vpconnAliUid(default_.id())
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
 * Express Connect Virtual Physical Connection can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:expressconnect/virtualPhysicalConnection:VirtualPhysicalConnection example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:expressconnect/virtualPhysicalConnection:VirtualPhysicalConnection")
public class VirtualPhysicalConnection extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the access point of the physical connection.
     * 
     */
    @Export(name="accessPointId", refs={String.class}, tree="[0]")
    private Output<String> accessPointId;

    /**
     * @return The ID of the access point of the physical connection.
     * 
     */
    public Output<String> accessPointId() {
        return this.accessPointId;
    }
    /**
     * The physical location where the physical connection access device is located.
     * 
     */
    @Export(name="adLocation", refs={String.class}, tree="[0]")
    private Output<String> adLocation;

    /**
     * @return The physical location where the physical connection access device is located.
     * 
     */
    public Output<String> adLocation() {
        return this.adLocation;
    }
    /**
     * The bandwidth of the physical connection. Unit: Mbps.
     * 
     */
    @Export(name="bandwidth", refs={String.class}, tree="[0]")
    private Output<String> bandwidth;

    /**
     * @return The bandwidth of the physical connection. Unit: Mbps.
     * 
     */
    public Output<String> bandwidth() {
        return this.bandwidth;
    }
    /**
     * The commercial status of the physical line. Value:-**Normal**: activated.-**Financialized**: Arrears locked.-**SecurityLocked**: locked for security reasons.
     * 
     */
    @Export(name="businessStatus", refs={String.class}, tree="[0]")
    private Output<String> businessStatus;

    /**
     * @return The commercial status of the physical line. Value:-**Normal**: activated.-**Financialized**: Arrears locked.-**SecurityLocked**: locked for security reasons.
     * 
     */
    public Output<String> businessStatus() {
        return this.businessStatus;
    }
    /**
     * The circuit code provided by the operator for the physical connection.
     * 
     */
    @Export(name="circuitCode", refs={String.class}, tree="[0]")
    private Output<String> circuitCode;

    /**
     * @return The circuit code provided by the operator for the physical connection.
     * 
     */
    public Output<String> circuitCode() {
        return this.circuitCode;
    }
    /**
     * The creation time of the resource
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the resource
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The description of the physical connection.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the physical connection.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies whether to precheck the API request. Valid values: `true` and `false`.
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Specifies whether to precheck the API request. Valid values: `true` and `false`.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The opening time of the physical connection.
     * 
     */
    @Export(name="enabledTime", refs={String.class}, tree="[0]")
    private Output<String> enabledTime;

    /**
     * @return The opening time of the physical connection.
     * 
     */
    public Output<String> enabledTime() {
        return this.enabledTime;
    }
    /**
     * The expiration time of the shared line.Time is expressed according to ISO8601 standard and UTC time is used. The format is: YYYY-MM-DDThh:mm:ssZ.
     * 
     */
    @Export(name="endTime", refs={String.class}, tree="[0]")
    private Output<String> endTime;

    /**
     * @return The expiration time of the shared line.Time is expressed according to ISO8601 standard and UTC time is used. The format is: YYYY-MM-DDThh:mm:ssZ.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * The estimated bandwidth value of the shared line. Valid values: `50M`, `100M`, `200M`, `300M`, `400M`, `500M`, `1G`, `2G`, `5G`, `8G`, and `10G`. **Note**: By default, the values of 2G, 5G, 8G, and 10G are unavailable. If you want to specify these values, contact your customer manager. Unit: **M** indicates Mbps, **G** indicates Gbps.
     * 
     */
    @Export(name="expectSpec", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expectSpec;

    /**
     * @return The estimated bandwidth value of the shared line. Valid values: `50M`, `100M`, `200M`, `300M`, `400M`, `500M`, `1G`, `2G`, `5G`, `8G`, and `10G`. **Note**: By default, the values of 2G, 5G, 8G, and 10G are unavailable. If you want to specify these values, contact your customer manager. Unit: **M** indicates Mbps, **G** indicates Gbps.
     * 
     */
    public Output<Optional<String>> expectSpec() {
        return Codegen.optional(this.expectSpec);
    }
    /**
     * Operators that provide access to physical lines. Value:-**CT**: China Telecom.-**CU**: China Unicom.-**CM**: China Mobile.-**CO**: China Other.-**Equinix**:Equinix.-**Other**: Other abroad.
     * 
     */
    @Export(name="lineOperator", refs={String.class}, tree="[0]")
    private Output<String> lineOperator;

    /**
     * @return Operators that provide access to physical lines. Value:-**CT**: China Telecom.-**CU**: China Unicom.-**CM**: China Mobile.-**CO**: China Other.-**Equinix**:Equinix.-**Other**: Other abroad.
     * 
     */
    public Output<String> lineOperator() {
        return this.lineOperator;
    }
    /**
     * The state of LOA. Value:-**Applying**:LOA application.-**Accept**:LOA application passed.-**Available**:LOA is Available.-**Rejected**:LOA application Rejected.-**Completing**: The dedicated line is under construction.-**Complete**: The construction of the dedicated line is completed.-**Deleted**:LOA has been Deleted.
     * 
     */
    @Export(name="loaStatus", refs={String.class}, tree="[0]")
    private Output<String> loaStatus;

    /**
     * @return The state of LOA. Value:-**Applying**:LOA application.-**Accept**:LOA application passed.-**Available**:LOA is Available.-**Rejected**:LOA application Rejected.-**Completing**: The dedicated line is under construction.-**Complete**: The construction of the dedicated line is completed.-**Deleted**:LOA has been Deleted.
     * 
     */
    public Output<String> loaStatus() {
        return this.loaStatus;
    }
    /**
     * The payment method of shared dedicated line. Value:
     * - **PayByPhysicalConnectionOwner**: indicates that the owner of the physical line associated with the shared line pays.
     * - **PayByVirtualPhysicalConnectionOwner**: indicates that the owner of the shared line pays.
     * 
     */
    @Export(name="orderMode", refs={String.class}, tree="[0]")
    private Output<String> orderMode;

    /**
     * @return The payment method of shared dedicated line. Value:
     * - **PayByPhysicalConnectionOwner**: indicates that the owner of the physical line associated with the shared line pays.
     * - **PayByVirtualPhysicalConnectionOwner**: indicates that the owner of the shared line pays.
     * 
     */
    public Output<String> orderMode() {
        return this.orderMode;
    }
    /**
     * The ID of the Alibaba Cloud account (primary account) to which the physical connection belongs.
     * 
     */
    @Export(name="parentPhysicalConnectionAliUid", refs={String.class}, tree="[0]")
    private Output<String> parentPhysicalConnectionAliUid;

    /**
     * @return The ID of the Alibaba Cloud account (primary account) to which the physical connection belongs.
     * 
     */
    public Output<String> parentPhysicalConnectionAliUid() {
        return this.parentPhysicalConnectionAliUid;
    }
    /**
     * The ID of the instance of the physical connection.
     * 
     */
    @Export(name="parentPhysicalConnectionId", refs={String.class}, tree="[0]")
    private Output<String> parentPhysicalConnectionId;

    /**
     * @return The ID of the instance of the physical connection.
     * 
     */
    public Output<String> parentPhysicalConnectionId() {
        return this.parentPhysicalConnectionId;
    }
    /**
     * The geographic location of the local data center.
     * 
     */
    @Export(name="peerLocation", refs={String.class}, tree="[0]")
    private Output<String> peerLocation;

    /**
     * @return The geographic location of the local data center.
     * 
     */
    public Output<String> peerLocation() {
        return this.peerLocation;
    }
    /**
     * The port number of the physical connection device.
     * 
     */
    @Export(name="portNumber", refs={String.class}, tree="[0]")
    private Output<String> portNumber;

    /**
     * @return The port number of the physical connection device.
     * 
     */
    public Output<String> portNumber() {
        return this.portNumber;
    }
    /**
     * Physical connection port type. Value:-**100Base-T**: 100 megabytes port.-**1000Base-T**: Gigabit port.-**1000Base-LX**: Gigabit single mode optical port (10km).-**10GBase-T**: 10 Gigabit port.-**10GBase-LR**: 10 Gigabit single mode optical port (10km).-**40GBase-LR**: 40 megabytes single-mode optical port.-**100GBase-LR**: 100,000 megabytes single-mode optical port.
     * 
     */
    @Export(name="portType", refs={String.class}, tree="[0]")
    private Output<String> portType;

    /**
     * @return Physical connection port type. Value:-**100Base-T**: 100 megabytes port.-**1000Base-T**: Gigabit port.-**1000Base-LX**: Gigabit single mode optical port (10km).-**10GBase-T**: 10 Gigabit port.-**10GBase-LR**: 10 Gigabit single mode optical port (10km).-**40GBase-LR**: 40 megabytes single-mode optical port.-**100GBase-LR**: 100,000 megabytes single-mode optical port.
     * 
     */
    public Output<String> portType() {
        return this.portType;
    }
    /**
     * The ID of the redundant physical connection.
     * 
     */
    @Export(name="redundantPhysicalConnectionId", refs={String.class}, tree="[0]")
    private Output<String> redundantPhysicalConnectionId;

    /**
     * @return The ID of the redundant physical connection.
     * 
     */
    public Output<String> redundantPhysicalConnectionId() {
        return this.redundantPhysicalConnectionId;
    }
    /**
     * The resource group id.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The resource group id.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The bandwidth value of the shared line. Valid values: `50M`, `100M`, `200M`, `300M`, `400M`, `500M`, `1G`, `2G`, `5G`, `8G`, and `10G`. **Note**: By default, the values of 2G, 5G, 8G, and 10G are unavailable. If you want to specify these values, contact your customer manager. Unit: **M** indicates Mbps, **G** indicates Gbps.
     * 
     */
    @Export(name="spec", refs={String.class}, tree="[0]")
    private Output<String> spec;

    /**
     * @return The bandwidth value of the shared line. Valid values: `50M`, `100M`, `200M`, `300M`, `400M`, `500M`, `1G`, `2G`, `5G`, `8G`, and `10G`. **Note**: By default, the values of 2G, 5G, 8G, and 10G are unavailable. If you want to specify these values, contact your customer manager. Unit: **M** indicates Mbps, **G** indicates Gbps.
     * 
     */
    public Output<String> spec() {
        return this.spec;
    }
    /**
     * The status of the resource
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The name of the physical connection.
     * 
     */
    @Export(name="virtualPhysicalConnectionName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> virtualPhysicalConnectionName;

    /**
     * @return The name of the physical connection.
     * 
     */
    public Output<Optional<String>> virtualPhysicalConnectionName() {
        return Codegen.optional(this.virtualPhysicalConnectionName);
    }
    /**
     * The business status of the shared line. Value:-**Confirmed**: The shared line has been Confirmed to receive.-**UnConfirmed**: The shared line has not been confirmed to be received.-**Deleted**: The shared line has been Deleted.
     * 
     */
    @Export(name="virtualPhysicalConnectionStatus", refs={String.class}, tree="[0]")
    private Output<String> virtualPhysicalConnectionStatus;

    /**
     * @return The business status of the shared line. Value:-**Confirmed**: The shared line has been Confirmed to receive.-**UnConfirmed**: The shared line has not been confirmed to be received.-**Deleted**: The shared line has been Deleted.
     * 
     */
    public Output<String> virtualPhysicalConnectionStatus() {
        return this.virtualPhysicalConnectionStatus;
    }
    /**
     * The VLAN ID of the shared leased line. Valid values: `0` to `2999`.
     * 
     */
    @Export(name="vlanId", refs={Integer.class}, tree="[0]")
    private Output<Integer> vlanId;

    /**
     * @return The VLAN ID of the shared leased line. Valid values: `0` to `2999`.
     * 
     */
    public Output<Integer> vlanId() {
        return this.vlanId;
    }
    /**
     * The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
     * 
     */
    @Export(name="vpconnAliUid", refs={String.class}, tree="[0]")
    private Output<String> vpconnAliUid;

    /**
     * @return The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
     * 
     */
    public Output<String> vpconnAliUid() {
        return this.vpconnAliUid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualPhysicalConnection(java.lang.String name) {
        this(name, VirtualPhysicalConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualPhysicalConnection(java.lang.String name, VirtualPhysicalConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualPhysicalConnection(java.lang.String name, VirtualPhysicalConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:expressconnect/virtualPhysicalConnection:VirtualPhysicalConnection", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private VirtualPhysicalConnection(java.lang.String name, Output<java.lang.String> id, @Nullable VirtualPhysicalConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:expressconnect/virtualPhysicalConnection:VirtualPhysicalConnection", name, state, makeResourceOptions(options, id), false);
    }

    private static VirtualPhysicalConnectionArgs makeArgs(VirtualPhysicalConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? VirtualPhysicalConnectionArgs.Empty : args;
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
    public static VirtualPhysicalConnection get(java.lang.String name, Output<java.lang.String> id, @Nullable VirtualPhysicalConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualPhysicalConnection(name, id, state, options);
    }
}
