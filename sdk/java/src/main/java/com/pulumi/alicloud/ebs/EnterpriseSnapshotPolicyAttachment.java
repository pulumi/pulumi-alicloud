// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ebs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ebs.EnterpriseSnapshotPolicyAttachmentArgs;
import com.pulumi.alicloud.ebs.inputs.EnterpriseSnapshotPolicyAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a EBS Enterprise Snapshot Policy Attachment resource. Enterprise-level snapshot policy cloud disk binding relationship.
 * 
 * For information about EBS Enterprise Snapshot Policy Attachment and how to use it, see [What is Enterprise Snapshot Policy Attachment](https://next.api.aliyun.com/api/ebs/2021-07-30/BindEnterpriseSnapshotPolicy).
 * 
 * &gt; **NOTE:** Available since v1.215.0.
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
 * import com.pulumi.alicloud.ecs.EcsDisk;
 * import com.pulumi.alicloud.ecs.EcsDiskArgs;
 * import com.pulumi.alicloud.ebs.EnterpriseSnapshotPolicy;
 * import com.pulumi.alicloud.ebs.EnterpriseSnapshotPolicyArgs;
 * import com.pulumi.alicloud.ebs.inputs.EnterpriseSnapshotPolicyScheduleArgs;
 * import com.pulumi.alicloud.ebs.inputs.EnterpriseSnapshotPolicyRetainRuleArgs;
 * import com.pulumi.alicloud.ebs.EnterpriseSnapshotPolicyAttachment;
 * import com.pulumi.alicloud.ebs.EnterpriseSnapshotPolicyAttachmentArgs;
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
 *         var defaultJkW46o = new EcsDisk("defaultJkW46o", EcsDiskArgs.builder()
 *             .category("cloud_essd")
 *             .description("esp-attachment-test")
 *             .zoneId("cn-hangzhou-i")
 *             .performanceLevel("PL1")
 *             .size(20)
 *             .diskName(name)
 *             .build());
 * 
 *         var defaultPE3jjR = new EnterpriseSnapshotPolicy("defaultPE3jjR", EnterpriseSnapshotPolicyArgs.builder()
 *             .status("DISABLED")
 *             .desc("DESC")
 *             .schedule(EnterpriseSnapshotPolicyScheduleArgs.builder()
 *                 .cronExpression("0 0 0 1 * ?")
 *                 .build())
 *             .enterpriseSnapshotPolicyName(name)
 *             .targetType("DISK")
 *             .retainRule(EnterpriseSnapshotPolicyRetainRuleArgs.builder()
 *                 .timeInterval(120)
 *                 .timeUnit("DAYS")
 *                 .build())
 *             .build());
 * 
 *         var default_ = new EnterpriseSnapshotPolicyAttachment("default", EnterpriseSnapshotPolicyAttachmentArgs.builder()
 *             .policyId(defaultPE3jjR.id())
 *             .diskId(defaultJkW46o.id())
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
 * EBS Enterprise Snapshot Policy Attachment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ebs/enterpriseSnapshotPolicyAttachment:EnterpriseSnapshotPolicyAttachment example &lt;policy_id&gt;:&lt;disk_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ebs/enterpriseSnapshotPolicyAttachment:EnterpriseSnapshotPolicyAttachment")
public class EnterpriseSnapshotPolicyAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Cloud Disk ID.
     * 
     */
    @Export(name="diskId", refs={String.class}, tree="[0]")
    private Output<String> diskId;

    /**
     * @return Cloud Disk ID.
     * 
     */
    public Output<String> diskId() {
        return this.diskId;
    }
    /**
     * the enterprise snapshot policy id.
     * 
     */
    @Export(name="policyId", refs={String.class}, tree="[0]")
    private Output<String> policyId;

    /**
     * @return the enterprise snapshot policy id.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnterpriseSnapshotPolicyAttachment(java.lang.String name) {
        this(name, EnterpriseSnapshotPolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnterpriseSnapshotPolicyAttachment(java.lang.String name, EnterpriseSnapshotPolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnterpriseSnapshotPolicyAttachment(java.lang.String name, EnterpriseSnapshotPolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ebs/enterpriseSnapshotPolicyAttachment:EnterpriseSnapshotPolicyAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EnterpriseSnapshotPolicyAttachment(java.lang.String name, Output<java.lang.String> id, @Nullable EnterpriseSnapshotPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ebs/enterpriseSnapshotPolicyAttachment:EnterpriseSnapshotPolicyAttachment", name, state, makeResourceOptions(options, id), false);
    }

    private static EnterpriseSnapshotPolicyAttachmentArgs makeArgs(EnterpriseSnapshotPolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EnterpriseSnapshotPolicyAttachmentArgs.Empty : args;
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
    public static EnterpriseSnapshotPolicyAttachment get(java.lang.String name, Output<java.lang.String> id, @Nullable EnterpriseSnapshotPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EnterpriseSnapshotPolicyAttachment(name, id, state, options);
    }
}
