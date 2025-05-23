// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.log.LogTailConfigArgs;
import com.pulumi.alicloud.log.inputs.LogTailConfigState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Logtail access service is a log collection agent provided by Log Service.
 * You can use Logtail to collect logs from servers such as Alibaba Cloud Elastic
 * Compute Service (ECS) instances in real time in the Log Service console. [Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm)
 * 
 * &gt; **NOTE:** Available since v1.93.0.
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
 * import com.pulumi.random.integer;
 * import com.pulumi.random.integerArgs;
 * import com.pulumi.alicloud.log.Project;
 * import com.pulumi.alicloud.log.ProjectArgs;
 * import com.pulumi.alicloud.log.Store;
 * import com.pulumi.alicloud.log.StoreArgs;
 * import com.pulumi.alicloud.log.LogTailConfig;
 * import com.pulumi.alicloud.log.LogTailConfigArgs;
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
 *         var default_ = new Integer("default", IntegerArgs.builder()
 *             .max(99999)
 *             .min(10000)
 *             .build());
 * 
 *         var example = new Project("example", ProjectArgs.builder()
 *             .projectName(String.format("terraform-example-%s", default_.result()))
 *             .description("terraform-example")
 *             .build());
 * 
 *         var exampleStore = new Store("exampleStore", StoreArgs.builder()
 *             .projectName(example.projectName())
 *             .logstoreName("example-store")
 *             .retentionPeriod(3650)
 *             .shardCount(3)
 *             .autoSplit(true)
 *             .maxSplitShardCount(60)
 *             .appendMeta(true)
 *             .build());
 * 
 *         var exampleLogTailConfig = new LogTailConfig("exampleLogTailConfig", LogTailConfigArgs.builder()
 *             .project(example.projectName())
 *             .logstore(exampleStore.logstoreName())
 *             .inputType("file")
 *             .name("terraform-example")
 *             .outputType("LogService")
 *             .inputDetail("""
 *   	{
 * 		"logPath": "/logPath",
 * 		"filePattern": "access.log",
 * 		"logType": "json_log",
 * 		"topicFormat": "default",
 * 		"discardUnmatch": false,
 * 		"enableRawLog": true,
 * 		"fileEncoding": "gbk",
 * 		"maxDepth": 10
 * 	}
 *             """)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Module Support
 * 
 * You can use the existing sls-logtail module
 * to create logtail config, machine group, install logtail on ECS instances and join instances into machine group one-click.
 * 
 * ## Import
 * 
 * Logtial config can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:log/logTailConfig:LogTailConfig example tf-log:tf-log-store:tf-log-config
 * ```
 * 
 */
@ResourceType(type="alicloud:log/logTailConfig:LogTailConfig")
public class LogTailConfig extends com.pulumi.resources.CustomResource {
    /**
     * The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
     * 
     */
    @Export(name="inputDetail", refs={String.class}, tree="[0]")
    private Output<String> inputDetail;

    /**
     * @return The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
     * 
     */
    public Output<String> inputDetail() {
        return this.inputDetail;
    }
    /**
     * The input type. Currently only two types of files and plugin are supported.
     * 
     */
    @Export(name="inputType", refs={String.class}, tree="[0]")
    private Output<String> inputType;

    /**
     * @return The input type. Currently only two types of files and plugin are supported.
     * 
     */
    public Output<String> inputType() {
        return this.inputType;
    }
    /**
     * This parameter is auto generated by server, please do not fill in.
     * 
     */
    @Export(name="lastModifyTime", refs={String.class}, tree="[0]")
    private Output<String> lastModifyTime;

    /**
     * @return This parameter is auto generated by server, please do not fill in.
     * 
     */
    public Output<String> lastModifyTime() {
        return this.lastModifyTime;
    }
    /**
     * The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
     * 
     */
    @Export(name="logSample", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> logSample;

    /**
     * @return The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
     * 
     */
    public Output<Optional<String>> logSample() {
        return Codegen.optional(this.logSample);
    }
    /**
     * The log store name to the query index belongs.
     * 
     */
    @Export(name="logstore", refs={String.class}, tree="[0]")
    private Output<String> logstore;

    /**
     * @return The log store name to the query index belongs.
     * 
     */
    public Output<String> logstore() {
        return this.logstore;
    }
    /**
     * The Logtail configuration name, which is unique in the same project.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The Logtail configuration name, which is unique in the same project.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The output type. Currently, only LogService is supported.
     * 
     */
    @Export(name="outputType", refs={String.class}, tree="[0]")
    private Output<String> outputType;

    /**
     * @return The output type. Currently, only LogService is supported.
     * 
     */
    public Output<String> outputType() {
        return this.outputType;
    }
    /**
     * The project name to the log store belongs.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The project name to the log store belongs.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogTailConfig(java.lang.String name) {
        this(name, LogTailConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogTailConfig(java.lang.String name, LogTailConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogTailConfig(java.lang.String name, LogTailConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:log/logTailConfig:LogTailConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LogTailConfig(java.lang.String name, Output<java.lang.String> id, @Nullable LogTailConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:log/logTailConfig:LogTailConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static LogTailConfigArgs makeArgs(LogTailConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LogTailConfigArgs.Empty : args;
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
    public static LogTailConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable LogTailConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogTailConfig(name, id, state, options);
    }
}
