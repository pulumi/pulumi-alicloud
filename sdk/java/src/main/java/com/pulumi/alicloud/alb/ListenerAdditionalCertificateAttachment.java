// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.alb.ListenerAdditionalCertificateAttachmentArgs;
import com.pulumi.alicloud.alb.inputs.ListenerAdditionalCertificateAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Application Load Balancer (ALB) Listener Additional Certificate Attachment resource.
 * 
 * For information about Application Load Balancer (ALB) Listener Additional Certificate Attachment and how to use it, see [What is Listener Additional Certificate Attachment](https://www.alibabacloud.com/help/en/slb/application-load-balancer/developer-reference/api-alb-2020-06-16-associateadditionalcertificateswithlistener).
 * 
 * &gt; **NOTE:** Available since v1.161.0.
 * 
 * ## Import
 * 
 * Application Load Balancer (ALB) Listener Additional Certificate Attachment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment example &lt;listener_id&gt;:&lt;certificate_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment")
public class ListenerAdditionalCertificateAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The Certificate ID.
     * 
     */
    @Export(name="certificateId", refs={String.class}, tree="[0]")
    private Output<String> certificateId;

    /**
     * @return The Certificate ID.
     * 
     */
    public Output<String> certificateId() {
        return this.certificateId;
    }
    /**
     * The type of the certificate.
     * 
     */
    @Export(name="certificateType", refs={String.class}, tree="[0]")
    private Output<String> certificateType;

    /**
     * @return The type of the certificate.
     * 
     */
    public Output<String> certificateType() {
        return this.certificateType;
    }
    /**
     * The ID of the ALB listener.
     * 
     */
    @Export(name="listenerId", refs={String.class}, tree="[0]")
    private Output<String> listenerId;

    /**
     * @return The ID of the ALB listener.
     * 
     */
    public Output<String> listenerId() {
        return this.listenerId;
    }
    /**
     * The status of the certificate.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the certificate.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ListenerAdditionalCertificateAttachment(java.lang.String name) {
        this(name, ListenerAdditionalCertificateAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ListenerAdditionalCertificateAttachment(java.lang.String name, ListenerAdditionalCertificateAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ListenerAdditionalCertificateAttachment(java.lang.String name, ListenerAdditionalCertificateAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ListenerAdditionalCertificateAttachment(java.lang.String name, Output<java.lang.String> id, @Nullable ListenerAdditionalCertificateAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment", name, state, makeResourceOptions(options, id), false);
    }

    private static ListenerAdditionalCertificateAttachmentArgs makeArgs(ListenerAdditionalCertificateAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ListenerAdditionalCertificateAttachmentArgs.Empty : args;
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
    public static ListenerAdditionalCertificateAttachment get(java.lang.String name, Output<java.lang.String> id, @Nullable ListenerAdditionalCertificateAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ListenerAdditionalCertificateAttachment(name, id, state, options);
    }
}
