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
 * For information about Cloud Storage Gateway Express Sync Share Attachment and how to use it, see [What is Express Sync Share Attachment](https://www.alibabacloud.com/help/en/cloud-storage-gateway/latest/addsharestoexpresssync).
 * 
 * &gt; **NOTE:** Available since v1.144.0.
 * 
 * ## Import
 * 
 * Cloud Storage Gateway Express Sync Share Attachment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cloudstoragegateway/expressSyncShareAttachment:ExpressSyncShareAttachment example &lt;express_sync_id&gt;:&lt;gateway_id&gt;:&lt;share_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cloudstoragegateway/expressSyncShareAttachment:ExpressSyncShareAttachment")
public class ExpressSyncShareAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the ExpressSync.
     * 
     */
    @Export(name="expressSyncId", refs={String.class}, tree="[0]")
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
    @Export(name="gatewayId", refs={String.class}, tree="[0]")
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
    @Export(name="shareName", refs={String.class}, tree="[0]")
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