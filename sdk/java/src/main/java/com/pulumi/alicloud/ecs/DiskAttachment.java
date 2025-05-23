// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.DiskAttachmentArgs;
import com.pulumi.alicloud.ecs.inputs.DiskAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **DEPRECATED:** This resource has been renamed to alicloud.ecs.EcsDiskAttachment from version 1.122.0.
 * 
 * Provides an Alicloud ECS Disk Attachment as a resource, to attach and detach disks from ECS Instances.
 * 
 * ## Example Usage
 * 
 * Basic usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.ecs.Disk;
 * import com.pulumi.alicloud.ecs.DiskArgs;
 * import com.pulumi.alicloud.ecs.Instance;
 * import com.pulumi.alicloud.ecs.InstanceArgs;
 * import com.pulumi.alicloud.ecs.DiskAttachment;
 * import com.pulumi.alicloud.ecs.DiskAttachmentArgs;
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
 *         // Create a new ECS disk-attachment and use it attach one disk to a new instance.
 *         var ecsSg = new SecurityGroup("ecsSg", SecurityGroupArgs.builder()
 *             .name("terraform-test-group")
 *             .description("New security group")
 *             .build());
 * 
 *         var ecsDisk = new Disk("ecsDisk", DiskArgs.builder()
 *             .availabilityZone("cn-beijing-a")
 *             .size(50)
 *             .tags(Map.of("Name", "TerraformTest-disk"))
 *             .build());
 * 
 *         var ecsInstance = new Instance("ecsInstance", InstanceArgs.builder()
 *             .imageId("ubuntu_18_04_64_20G_alibase_20190624.vhd")
 *             .instanceType("ecs.n4.small")
 *             .availabilityZone("cn-beijing-a")
 *             .securityGroups(ecsSg.id())
 *             .instanceName("Hello")
 *             .internetChargeType("PayByBandwidth")
 *             .tags(Map.of("Name", "TerraformTest-instance"))
 *             .build());
 * 
 *         var ecsDiskAtt = new DiskAttachment("ecsDiskAtt", DiskAttachmentArgs.builder()
 *             .diskId(ecsDisk.id())
 *             .instanceId(ecsInstance.id())
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
 * The disk attachment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ecs/diskAttachment:DiskAttachment example d-abc12345678:i-abc12355
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/diskAttachment:DiskAttachment")
public class DiskAttachment extends com.pulumi.resources.CustomResource {
    @Export(name="bootable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> bootable;

    public Output<Optional<Boolean>> bootable() {
        return Codegen.optional(this.bootable);
    }
    @Export(name="deleteWithInstance", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deleteWithInstance;

    public Output<Optional<Boolean>> deleteWithInstance() {
        return Codegen.optional(this.deleteWithInstance);
    }
    @Export(name="device", refs={String.class}, tree="[0]")
    private Output<String> device;

    public Output<String> device() {
        return this.device;
    }
    /**
     * ID of the Disk to be attached.
     * 
     */
    @Export(name="diskId", refs={String.class}, tree="[0]")
    private Output<String> diskId;

    /**
     * @return ID of the Disk to be attached.
     * 
     */
    public Output<String> diskId() {
        return this.diskId;
    }
    /**
     * ID of the Instance to attach to.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return ID of the Instance to attach to.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    @Export(name="keyPairName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyPairName;

    public Output<Optional<String>> keyPairName() {
        return Codegen.optional(this.keyPairName);
    }
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiskAttachment(java.lang.String name) {
        this(name, DiskAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiskAttachment(java.lang.String name, DiskAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiskAttachment(java.lang.String name, DiskAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/diskAttachment:DiskAttachment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DiskAttachment(java.lang.String name, Output<java.lang.String> id, @Nullable DiskAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/diskAttachment:DiskAttachment", name, state, makeResourceOptions(options, id), false);
    }

    private static DiskAttachmentArgs makeArgs(DiskAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DiskAttachmentArgs.Empty : args;
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
    public static DiskAttachment get(java.lang.String name, Output<java.lang.String> id, @Nullable DiskAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DiskAttachment(name, id, state, options);
    }
}
