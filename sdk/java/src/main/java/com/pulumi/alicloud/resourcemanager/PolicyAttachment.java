// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.resourcemanager.PolicyAttachmentArgs;
import com.pulumi.alicloud.resourcemanager.inputs.PolicyAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Resource Manager Policy Attachment resource to attaches a policy to an object. After you attach a policy to an object, the object has the operation permissions on the current resource group or the resources under the current account.
 * For information about Resource Manager Policy Attachment and how to use it, see [How to authorize and manage resource groups](https://www.alibabacloud.com/help/en/doc-detail/94490.htm).
 * 
 * &gt; **NOTE:** Available since v1.93.0.
 * 
 * ## Import
 * 
 * Resource Manager Policy Attachment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:resourcemanager/policyAttachment:PolicyAttachment example tf-testaccrdpolicy:Custom:tf-testaccrdpolicy{@literal @}11827252********.onaliyun.com:IMSUser:rg******
 * ```
 * 
 */
@ResourceType(type="alicloud:resourcemanager/policyAttachment:PolicyAttachment")
public class PolicyAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The name of the policy. name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
     * 
     */
    @Export(name="policyName", refs={String.class}, tree="[0]")
    private Output<String> policyName;

    /**
     * @return The name of the policy. name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }
    /**
     * The type of the policy. Valid values: `Custom`, `System`.
     * 
     */
    @Export(name="policyType", refs={String.class}, tree="[0]")
    private Output<String> policyType;

    /**
     * @return The type of the policy. Valid values: `Custom`, `System`.
     * 
     */
    public Output<String> policyType() {
        return this.policyType;
    }
    /**
     * The name of the object to which you want to attach the policy.
     * 
     */
    @Export(name="principalName", refs={String.class}, tree="[0]")
    private Output<String> principalName;

    /**
     * @return The name of the object to which you want to attach the policy.
     * 
     */
    public Output<String> principalName() {
        return this.principalName;
    }
    /**
     * The type of the object to which you want to attach the policy. Valid values: `IMSUser`: RAM user, `IMSGroup`: RAM user group, `ServiceRole`: RAM role.
     * 
     */
    @Export(name="principalType", refs={String.class}, tree="[0]")
    private Output<String> principalType;

    /**
     * @return The type of the object to which you want to attach the policy. Valid values: `IMSUser`: RAM user, `IMSGroup`: RAM user group, `ServiceRole`: RAM role.
     * 
     */
    public Output<String> principalType() {
        return this.principalType;
    }
    /**
     * The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyAttachment(java.lang.String name) {
        this(name, PolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyAttachment(java.lang.String name, PolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyAttachment(java.lang.String name, PolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/policyAttachment:PolicyAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PolicyAttachment(java.lang.String name, Output<java.lang.String> id, @Nullable PolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/policyAttachment:PolicyAttachment", name, state, makeResourceOptions(options, id), false);
    }

    private static PolicyAttachmentArgs makeArgs(PolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PolicyAttachmentArgs.Empty : args;
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
    public static PolicyAttachment get(java.lang.String name, Output<java.lang.String> id, @Nullable PolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PolicyAttachment(name, id, state, options);
    }
}
