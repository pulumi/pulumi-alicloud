// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cms.HybridMonitorFcTaskArgs;
import com.pulumi.alicloud.cms.inputs.HybridMonitorFcTaskState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cloud Monitor Service Hybrid Monitor Fc Task resource.
 * 
 * For information about Cloud Monitor Service Hybrid Monitor Fc Task and how to use it, see [What is Hybrid Monitor Fc Task](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createhybridmonitortask).
 * 
 * &gt; **NOTE:** Available since v1.179.0.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.cms.Namespace;
 * import com.pulumi.alicloud.cms.NamespaceArgs;
 * import com.pulumi.alicloud.cms.HybridMonitorFcTask;
 * import com.pulumi.alicloud.cms.HybridMonitorFcTaskArgs;
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
 *         final var name = config.get("name").orElse("tf-example");
 *         final var default = AlicloudFunctions.getAccount(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         var defaultNamespace = new Namespace("defaultNamespace", NamespaceArgs.builder()
 *             .description(name)
 *             .namespace(name)
 *             .specification("cms.s1.large")
 *             .build());
 * 
 *         var defaultHybridMonitorFcTask = new HybridMonitorFcTask("defaultHybridMonitorFcTask", HybridMonitorFcTaskArgs.builder()
 *             .namespace(defaultNamespace.id())
 *             .yarmConfig("""
 * ---
 * products:
 * - namespace: "acs_ecs_dashboard"
 *   metric_info:
 *   - metric_list:
 *     - "CPUUtilization"
 *     - "DiskReadBPS"
 *     - "InternetOut"
 *     - "IntranetOut"
 *     - "cpu_idle"
 *     - "cpu_system"
 *     - "cpu_total"
 *     - "diskusage_utilization"
 * - namespace: "acs_rds_dashboard"
 *   metric_info:
 *   - metric_list:
 *     - "MySQL_QPS"
 *     - "MySQL_TPS"
 *             """)
 *             .targetUserId(default_.id())
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
 * Cloud Monitor Service Hybrid Monitor Fc Task can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cms/hybridMonitorFcTask:HybridMonitorFcTask example &lt;hybrid_monitor_fc_task_id&gt;:&lt;namespace&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cms/hybridMonitorFcTask:HybridMonitorFcTask")
public class HybridMonitorFcTask extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the monitoring task.
     * 
     */
    @Export(name="hybridMonitorFcTaskId", refs={String.class}, tree="[0]")
    private Output<String> hybridMonitorFcTaskId;

    /**
     * @return The ID of the monitoring task.
     * 
     */
    public Output<String> hybridMonitorFcTaskId() {
        return this.hybridMonitorFcTaskId;
    }
    /**
     * The index warehouse where the host belongs.
     * 
     */
    @Export(name="namespace", refs={String.class}, tree="[0]")
    private Output<String> namespace;

    /**
     * @return The index warehouse where the host belongs.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }
    /**
     * The ID of the member account. If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in Resource Directory to Hybrid Cloud Monitoring. You can use Resource Directory to monitor Alibaba Cloud services across enterprise accounts.
     * 
     */
    @Export(name="targetUserId", refs={String.class}, tree="[0]")
    private Output<String> targetUserId;

    /**
     * @return The ID of the member account. If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in Resource Directory to Hybrid Cloud Monitoring. You can use Resource Directory to monitor Alibaba Cloud services across enterprise accounts.
     * 
     */
    public Output<String> targetUserId() {
        return this.targetUserId;
    }
    /**
     * The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
     * 
     */
    @Export(name="yarmConfig", refs={String.class}, tree="[0]")
    private Output<String> yarmConfig;

    /**
     * @return The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
     * 
     */
    public Output<String> yarmConfig() {
        return this.yarmConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HybridMonitorFcTask(java.lang.String name) {
        this(name, HybridMonitorFcTaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HybridMonitorFcTask(java.lang.String name, HybridMonitorFcTaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HybridMonitorFcTask(java.lang.String name, HybridMonitorFcTaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/hybridMonitorFcTask:HybridMonitorFcTask", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private HybridMonitorFcTask(java.lang.String name, Output<java.lang.String> id, @Nullable HybridMonitorFcTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cms/hybridMonitorFcTask:HybridMonitorFcTask", name, state, makeResourceOptions(options, id), false);
    }

    private static HybridMonitorFcTaskArgs makeArgs(HybridMonitorFcTaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HybridMonitorFcTaskArgs.Empty : args;
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
    public static HybridMonitorFcTask get(java.lang.String name, Output<java.lang.String> id, @Nullable HybridMonitorFcTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HybridMonitorFcTask(name, id, state, options);
    }
}
