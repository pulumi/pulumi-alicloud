// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.iot;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.iot.DeviceGroupArgs;
import com.pulumi.alicloud.iot.inputs.DeviceGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Iot Device Group resource.
 * 
 * For information about Iot Device Group and how to use it, see [What is Device Group](https://www.alibabacloud.com/help/product/30520.htm).
 * 
 * &gt; **NOTE:** Available in v1.134.0+.
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
 * import com.pulumi.alicloud.iot.DeviceGroup;
 * import com.pulumi.alicloud.iot.DeviceGroupArgs;
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
 *         var example = new DeviceGroup(&#34;example&#34;, DeviceGroupArgs.builder()        
 *             .groupName(&#34;example_value&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Iot Device Group can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:iot/deviceGroup:DeviceGroup example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:iot/deviceGroup:DeviceGroup")
public class DeviceGroup extends com.pulumi.resources.CustomResource {
    /**
     * The GroupDesc of the device group.
     * 
     */
    @Export(name="groupDesc", type=String.class, parameters={})
    private Output</* @Nullable */ String> groupDesc;

    /**
     * @return The GroupDesc of the device group.
     * 
     */
    public Output<Optional<String>> groupDesc() {
        return Codegen.optional(this.groupDesc);
    }
    /**
     * The GroupName of the device group.
     * 
     */
    @Export(name="groupName", type=String.class, parameters={})
    private Output<String> groupName;

    /**
     * @return The GroupName of the device group.
     * 
     */
    public Output<String> groupName() {
        return this.groupName;
    }
    /**
     * The id of the Iot Instance.
     * 
     */
    @Export(name="iotInstanceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> iotInstanceId;

    /**
     * @return The id of the Iot Instance.
     * 
     */
    public Output<Optional<String>> iotInstanceId() {
        return Codegen.optional(this.iotInstanceId);
    }
    /**
     * The id of the SuperGroup.
     * 
     */
    @Export(name="superGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> superGroupId;

    /**
     * @return The id of the SuperGroup.
     * 
     */
    public Output<Optional<String>> superGroupId() {
        return Codegen.optional(this.superGroupId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeviceGroup(String name) {
        this(name, DeviceGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeviceGroup(String name, DeviceGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeviceGroup(String name, DeviceGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:iot/deviceGroup:DeviceGroup", name, args == null ? DeviceGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeviceGroup(String name, Output<String> id, @Nullable DeviceGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:iot/deviceGroup:DeviceGroup", name, state, makeResourceOptions(options, id));
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
    public static DeviceGroup get(String name, Output<String> id, @Nullable DeviceGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeviceGroup(name, id, state, options);
    }
}