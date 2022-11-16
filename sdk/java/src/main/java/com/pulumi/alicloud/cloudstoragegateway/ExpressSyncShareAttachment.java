// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudstoragegateway;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cloudstoragegateway.ExpressSyncShareAttachmentArgs;
import com.pulumi.alicloud.cloudstoragegateway.inputs.ExpressSyncShareAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Storage Gateway Express Sync Share Attachment resource.
 * 
 * For information about Cloud Storage Gateway Express Sync Share Attachment and how to use it, see [What is Express Sync Share Attachment](https://www.alibabacloud.com/help/en/doc-detail/53972.htm).
 * 
 * &gt; **NOTE:** Available in v1.144.0+.
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
 * import com.pulumi.alicloud.cloudstoragegateway.CloudstoragegatewayFunctions;
 * import com.pulumi.alicloud.cloudstoragegateway.inputs.GetStocksArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.cloudstoragegateway.StorageBundle;
 * import com.pulumi.alicloud.cloudstoragegateway.StorageBundleArgs;
 * import com.pulumi.alicloud.cloudstoragegateway.Gateway;
 * import com.pulumi.alicloud.cloudstoragegateway.GatewayArgs;
 * import com.pulumi.alicloud.cloudstoragegateway.GatewayCacheDisk;
 * import com.pulumi.alicloud.cloudstoragegateway.GatewayCacheDiskArgs;
 * import com.pulumi.alicloud.oss.Bucket;
 * import com.pulumi.alicloud.oss.BucketArgs;
 * import com.pulumi.alicloud.cloudstoragegateway.GatewayFileShare;
 * import com.pulumi.alicloud.cloudstoragegateway.GatewayFileShareArgs;
 * import com.pulumi.alicloud.cloudstoragegateway.ExpressSync;
 * import com.pulumi.alicloud.cloudstoragegateway.ExpressSyncArgs;
 * import com.pulumi.alicloud.cloudstoragegateway.ExpressSyncShareAttachment;
 * import com.pulumi.alicloud.cloudstoragegateway.ExpressSyncShareAttachmentArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;tftest&#34;);
 *         final var region = config.get(&#34;region&#34;).orElse(&#34;cn-shanghai&#34;);
 *         final var defaultStocks = CloudstoragegatewayFunctions.getStocks(GetStocksArgs.builder()
 *             .gatewayClass(&#34;Standard&#34;)
 *             .build());
 * 
 *         var vpc = new Network(&#34;vpc&#34;, NetworkArgs.builder()        
 *             .vpcName(name)
 *             .cidrBlock(&#34;192.16.0.0/12&#34;)
 *             .build());
 * 
 *         var defaultSwitch = new Switch(&#34;defaultSwitch&#34;, SwitchArgs.builder()        
 *             .vpcId(vpc.id())
 *             .cidrBlock(&#34;192.16.0.0/21&#34;)
 *             .zoneId(defaultStocks.applyValue(getStocksResult -&gt; getStocksResult.stocks()[0].zoneId()))
 *             .vswitchName(name)
 *             .build());
 * 
 *         var defaultStorageBundle = new StorageBundle(&#34;defaultStorageBundle&#34;, StorageBundleArgs.builder()        
 *             .storageBundleName(name)
 *             .build());
 * 
 *         var defaultGateway = new Gateway(&#34;defaultGateway&#34;, GatewayArgs.builder()        
 *             .description(&#34;tf-acctestDesalone&#34;)
 *             .gatewayClass(&#34;Standard&#34;)
 *             .type(&#34;File&#34;)
 *             .paymentType(&#34;PayAsYouGo&#34;)
 *             .vswitchId(defaultSwitch.id())
 *             .releaseAfterExpiration(true)
 *             .publicNetworkBandwidth(10)
 *             .storageBundleId(defaultStorageBundle.id())
 *             .location(&#34;Cloud&#34;)
 *             .gatewayName(name)
 *             .build());
 * 
 *         var defaultGatewayCacheDisk = new GatewayCacheDisk(&#34;defaultGatewayCacheDisk&#34;, GatewayCacheDiskArgs.builder()        
 *             .cacheDiskCategory(&#34;cloud_efficiency&#34;)
 *             .gatewayId(defaultGateway.id())
 *             .cacheDiskSizeInGb(50)
 *             .build());
 * 
 *         var defaultBucket = new Bucket(&#34;defaultBucket&#34;, BucketArgs.builder()        
 *             .bucket(name)
 *             .build());
 * 
 *         var defaultGatewayFileShare = new GatewayFileShare(&#34;defaultGatewayFileShare&#34;, GatewayFileShareArgs.builder()        
 *             .gatewayFileShareName(name)
 *             .gatewayId(defaultGateway.id())
 *             .localPath(defaultGatewayCacheDisk.localFilePath())
 *             .ossBucketName(defaultBucket.bucket())
 *             .ossEndpoint(defaultBucket.extranetEndpoint())
 *             .protocol(&#34;NFS&#34;)
 *             .remoteSync(false)
 *             .feLimit(0)
 *             .backendLimit(0)
 *             .cacheMode(&#34;Cache&#34;)
 *             .squash(&#34;none&#34;)
 *             .lagPeriod(5)
 *             .build());
 * 
 *         var defaultExpressSync = new ExpressSync(&#34;defaultExpressSync&#34;, ExpressSyncArgs.builder()        
 *             .bucketName(defaultGatewayFileShare.ossBucketName())
 *             .bucketRegion(region)
 *             .description(name)
 *             .expressSyncName(name)
 *             .build());
 * 
 *         var defaultExpressSyncShareAttachment = new ExpressSyncShareAttachment(&#34;defaultExpressSyncShareAttachment&#34;, ExpressSyncShareAttachmentArgs.builder()        
 *             .expressSyncId(defaultExpressSync.id())
 *             .gatewayId(defaultGateway.id())
 *             .shareName(defaultGatewayFileShare.gatewayFileShareName())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Cloud Storage Gateway Express Sync Share Attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:cloudstoragegateway/expressSyncShareAttachment:ExpressSyncShareAttachment example &lt;express_sync_id&gt;:&lt;gateway_id&gt;:&lt;share_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cloudstoragegateway/expressSyncShareAttachment:ExpressSyncShareAttachment")
public class ExpressSyncShareAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the ExpressSync.
     * 
     */
    @Export(name="expressSyncId", type=String.class, parameters={})
    private Output<String> expressSyncId;

    /**
     * @return The ID of the ExpressSync.
     * 
     */
    public Output<String> expressSyncId() {
        return this.expressSyncId;
    }
    /**
     * The ID of the Gateway.
     * 
     */
    @Export(name="gatewayId", type=String.class, parameters={})
    private Output<String> gatewayId;

    /**
     * @return The ID of the Gateway.
     * 
     */
    public Output<String> gatewayId() {
        return this.gatewayId;
    }
    /**
     * The name of the GatewayFileShare. **NOTE:** When GatewayFileShare is associated with a speed sync group, its reverse synchronization function will be turned off by default.
     * 
     */
    @Export(name="shareName", type=String.class, parameters={})
    private Output<String> shareName;

    /**
     * @return The name of the GatewayFileShare. **NOTE:** When GatewayFileShare is associated with a speed sync group, its reverse synchronization function will be turned off by default.
     * 
     */
    public Output<String> shareName() {
        return this.shareName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExpressSyncShareAttachment(String name) {
        this(name, ExpressSyncShareAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExpressSyncShareAttachment(String name, ExpressSyncShareAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExpressSyncShareAttachment(String name, ExpressSyncShareAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudstoragegateway/expressSyncShareAttachment:ExpressSyncShareAttachment", name, args == null ? ExpressSyncShareAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExpressSyncShareAttachment(String name, Output<String> id, @Nullable ExpressSyncShareAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudstoragegateway/expressSyncShareAttachment:ExpressSyncShareAttachment", name, state, makeResourceOptions(options, id));
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
    public static ExpressSyncShareAttachment get(String name, Output<String> id, @Nullable ExpressSyncShareAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExpressSyncShareAttachment(name, id, state, options);
    }
}