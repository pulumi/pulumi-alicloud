// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eais;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.eais.ClientInstanceAttachmentArgs;
import com.pulumi.alicloud.eais.inputs.ClientInstanceAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * EAIS Client Instance Attachment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:eais/clientInstanceAttachment:ClientInstanceAttachment example &lt;instance_id&gt;:&lt;client_instance_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:eais/clientInstanceAttachment:ClientInstanceAttachment")
public class ClientInstanceAttachment extends com.pulumi.resources.CustomResource {
    /**
     * EAIS instance category, valid values: `eais`, `ei`, default is `eais`.
     * 
     */
    @Export(name="category", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> category;

    /**
     * @return EAIS instance category, valid values: `eais`, `ei`, default is `eais`.
     * 
     */
    public Output<Optional<String>> category() {
        return Codegen.optional(this.category);
    }
    /**
     * The ID of the ECS or ECI instance bound to the EAIS instance.
     * 
     */
    @Export(name="clientInstanceId", refs={String.class}, tree="[0]")
    private Output<String> clientInstanceId;

    /**
     * @return The ID of the ECS or ECI instance bound to the EAIS instance.
     * 
     */
    public Output<String> clientInstanceId() {
        return this.clientInstanceId;
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
     * The Ei instance specification, which is used to filter matching specifications for updating.
     * 
     */
    @Export(name="eiInstanceType", refs={String.class}, tree="[0]")
    private Output<String> eiInstanceType;

    /**
     * @return The Ei instance specification, which is used to filter matching specifications for updating.
     * 
     */
    public Output<String> eiInstanceType() {
        return this.eiInstanceType;
    }
    /**
     * The EAIS instance ID.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The EAIS instance ID.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The region ID of the resource
     * 
     */
    @Export(name="regionId", refs={String.class}, tree="[0]")
    private Output<String> regionId;

    /**
     * @return The region ID of the resource
     * 
     */
    public Output<String> regionId() {
        return this.regionId;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClientInstanceAttachment(java.lang.String name) {
        this(name, ClientInstanceAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClientInstanceAttachment(java.lang.String name, ClientInstanceAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClientInstanceAttachment(java.lang.String name, ClientInstanceAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eais/clientInstanceAttachment:ClientInstanceAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ClientInstanceAttachment(java.lang.String name, Output<java.lang.String> id, @Nullable ClientInstanceAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eais/clientInstanceAttachment:ClientInstanceAttachment", name, state, makeResourceOptions(options, id), false);
    }

    private static ClientInstanceAttachmentArgs makeArgs(ClientInstanceAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ClientInstanceAttachmentArgs.Empty : args;
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
    public static ClientInstanceAttachment get(java.lang.String name, Output<java.lang.String> id, @Nullable ClientInstanceAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClientInstanceAttachment(name, id, state, options);
    }
}
