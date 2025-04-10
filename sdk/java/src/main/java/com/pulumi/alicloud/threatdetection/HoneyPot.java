// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.threatdetection.HoneyPotArgs;
import com.pulumi.alicloud.threatdetection.inputs.HoneyPotState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Threat Detection Honey Pot resource.
 * 
 * For information about Threat Detection Honey Pot and how to use it, see [What is Honey Pot](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypot).
 * 
 * &gt; **NOTE:** Available since v1.195.0.
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
 * import com.pulumi.alicloud.threatdetection.ThreatdetectionFunctions;
 * import com.pulumi.alicloud.threatdetection.inputs.GetHoneypotImagesArgs;
 * import com.pulumi.alicloud.threatdetection.HoneypotNode;
 * import com.pulumi.alicloud.threatdetection.HoneypotNodeArgs;
 * import com.pulumi.alicloud.threatdetection.HoneyPot;
 * import com.pulumi.alicloud.threatdetection.HoneyPotArgs;
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
 *         final var name = config.get("name").orElse("tfexample");
 *         final var default = ThreatdetectionFunctions.getHoneypotImages(GetHoneypotImagesArgs.builder()
 *             .nameRegex("^ruoyi")
 *             .build());
 * 
 *         var defaultHoneypotNode = new HoneypotNode("defaultHoneypotNode", HoneypotNodeArgs.builder()
 *             .nodeName(name)
 *             .availableProbeNum(20)
 *             .securityGroupProbeIpLists("0.0.0.0/0")
 *             .build());
 * 
 *         var defaultHoneyPot = new HoneyPot("defaultHoneyPot", HoneyPotArgs.builder()
 *             .honeypotImageName(default_.images()[0].honeypotImageName())
 *             .honeypotImageId(default_.images()[0].honeypotImageId())
 *             .honeypotName(name)
 *             .nodeId(defaultHoneypotNode.id())
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
 * Threat Detection Honey Pot can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:threatdetection/honeyPot:HoneyPot example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:threatdetection/honeyPot:HoneyPot")
public class HoneyPot extends com.pulumi.resources.CustomResource {
    /**
     * Honeypot ID.
     * 
     */
    @Export(name="honeypotId", refs={String.class}, tree="[0]")
    private Output<String> honeypotId;

    /**
     * @return Honeypot ID.
     * 
     */
    public Output<String> honeypotId() {
        return this.honeypotId;
    }
    /**
     * The image ID of the honeypot.
     * 
     */
    @Export(name="honeypotImageId", refs={String.class}, tree="[0]")
    private Output<String> honeypotImageId;

    /**
     * @return The image ID of the honeypot.
     * 
     */
    public Output<String> honeypotImageId() {
        return this.honeypotImageId;
    }
    /**
     * Honeypot mirror name.
     * 
     */
    @Export(name="honeypotImageName", refs={String.class}, tree="[0]")
    private Output<String> honeypotImageName;

    /**
     * @return Honeypot mirror name.
     * 
     */
    public Output<String> honeypotImageName() {
        return this.honeypotImageName;
    }
    /**
     * Honeypot custom name.
     * 
     */
    @Export(name="honeypotName", refs={String.class}, tree="[0]")
    private Output<String> honeypotName;

    /**
     * @return Honeypot custom name.
     * 
     */
    public Output<String> honeypotName() {
        return this.honeypotName;
    }
    /**
     * The ID of the honeypot management node.
     * 
     */
    @Export(name="nodeId", refs={String.class}, tree="[0]")
    private Output<String> nodeId;

    /**
     * @return The ID of the honeypot management node.
     * 
     */
    public Output<String> nodeId() {
        return this.nodeId;
    }
    /**
     * The custom parameter ID of honeypot.
     * 
     */
    @Export(name="presetId", refs={String.class}, tree="[0]")
    private Output<String> presetId;

    /**
     * @return The custom parameter ID of honeypot.
     * 
     */
    public Output<String> presetId() {
        return this.presetId;
    }
    /**
     * Honeypot status.
     * 
     */
    @Export(name="states", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> states;

    /**
     * @return Honeypot status.
     * 
     */
    public Output<List<String>> states() {
        return this.states;
    }
    /**
     * The status of the resource.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HoneyPot(java.lang.String name) {
        this(name, HoneyPotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HoneyPot(java.lang.String name, HoneyPotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HoneyPot(java.lang.String name, HoneyPotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:threatdetection/honeyPot:HoneyPot", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private HoneyPot(java.lang.String name, Output<java.lang.String> id, @Nullable HoneyPotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:threatdetection/honeyPot:HoneyPot", name, state, makeResourceOptions(options, id), false);
    }

    private static HoneyPotArgs makeArgs(HoneyPotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HoneyPotArgs.Empty : args;
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
    public static HoneyPot get(java.lang.String name, Output<java.lang.String> id, @Nullable HoneyPotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HoneyPot(name, id, state, options);
    }
}
