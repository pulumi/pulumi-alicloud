// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.expressconnect.TrafficQosArgs;
import com.pulumi.alicloud.expressconnect.inputs.TrafficQosState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Express Connect Traffic Qos resource. Express Connect Traffic QoS Policy.
 * 
 * For information about Express Connect Traffic Qos and how to use it, see [What is Traffic Qos](https://next.api.alibabacloud.com/document/Vpc/2016-04-28/CreateExpressConnectTrafficQos).
 * 
 * &gt; **NOTE:** Available since v1.224.0.
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
 * import com.pulumi.alicloud.expressconnect.TrafficQos;
 * import com.pulumi.alicloud.expressconnect.TrafficQosArgs;
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
 *         final var default = ExpressconnectFunctions.getPhysicalConnections(GetPhysicalConnectionsArgs.builder()
 *             .nameRegex("preserved-NODELETING")
 *             .build());
 * 
 *         var createQos = new TrafficQos("createQos", TrafficQosArgs.builder()
 *             .qosName(name)
 *             .qosDescription("terraform-example")
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
 * Express Connect Traffic Qos can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:expressconnect/trafficQos:TrafficQos example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:expressconnect/trafficQos:TrafficQos")
public class TrafficQos extends com.pulumi.resources.CustomResource {
    /**
     * The description of the QoS policy.  The length is **0** to **256** characters and cannot start with &#39;http:// &#39;or &#39;https.
     * 
     */
    @Export(name="qosDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> qosDescription;

    /**
     * @return The description of the QoS policy.  The length is **0** to **256** characters and cannot start with &#39;http:// &#39;or &#39;https.
     * 
     */
    public Output<Optional<String>> qosDescription() {
        return Codegen.optional(this.qosDescription);
    }
    /**
     * The name of the QoS policy.  The length is **0** to **128** characters and cannot start with &#39;http:// &#39;or &#39;https.
     * 
     */
    @Export(name="qosName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> qosName;

    /**
     * @return The name of the QoS policy.  The length is **0** to **128** characters and cannot start with &#39;http:// &#39;or &#39;https.
     * 
     */
    public Output<Optional<String>> qosName() {
        return Codegen.optional(this.qosName);
    }
    /**
     * The status of the QoS policy. Value:
     * &gt; **NOTE:**  QoS in the configuration state will restrict the creation, update, and deletion of most QoS policies, QoS queues, and QoS rules.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the QoS policy. Value:
     * &gt; **NOTE:**  QoS in the configuration state will restrict the creation, update, and deletion of most QoS policies, QoS queues, and QoS rules.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrafficQos(String name) {
        this(name, TrafficQosArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrafficQos(String name, @Nullable TrafficQosArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrafficQos(String name, @Nullable TrafficQosArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:expressconnect/trafficQos:TrafficQos", name, args == null ? TrafficQosArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrafficQos(String name, Output<String> id, @Nullable TrafficQosState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:expressconnect/trafficQos:TrafficQos", name, state, makeResourceOptions(options, id));
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
    public static TrafficQos get(String name, Output<String> id, @Nullable TrafficQosState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrafficQos(name, id, state, options);
    }
}