// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.fc.FunctionArgs;
import com.pulumi.alicloud.fc.inputs.FunctionState;
import com.pulumi.alicloud.fc.outputs.FunctionCustomContainerConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Alicloud Function Compute Function resource. Function allows you to trigger execution of code in response to events in Alibaba Cloud. The Function itself includes source code and runtime configuration.
 *  For information about Service and how to use it, see [What is Function Compute](https://www.alibabacloud.com/help/en/fc/developer-reference/api-createfunction).
 * 
 * &gt; **NOTE:** The resource requires a provider field &#39;account_id&#39;. See account_id.
 * 
 * &gt; **NOTE:** Available since v1.10.0.
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
 * import com.pulumi.alicloud.ram.Role;
 * import com.pulumi.alicloud.ram.RoleArgs;
 * import com.pulumi.alicloud.ram.RolePolicyAttachment;
 * import com.pulumi.alicloud.ram.RolePolicyAttachmentArgs;
 * import com.pulumi.alicloud.fc.Service;
 * import com.pulumi.alicloud.fc.ServiceArgs;
 * import com.pulumi.alicloud.fc.inputs.ServiceLogConfigArgs;
 * import com.pulumi.alicloud.oss.Bucket;
 * import com.pulumi.alicloud.oss.BucketArgs;
 * import com.pulumi.alicloud.oss.BucketObject;
 * import com.pulumi.alicloud.oss.BucketObjectArgs;
 * import com.pulumi.alicloud.fc.Function;
 * import com.pulumi.alicloud.fc.FunctionArgs;
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
 *         var defaultProject = new Project("defaultProject", ProjectArgs.builder()
 *             .projectName(String.format("example-value-%s", default_.result()))
 *             .build());
 * 
 *         var defaultStore = new Store("defaultStore", StoreArgs.builder()
 *             .projectName(defaultProject.projectName())
 *             .logstoreName("example-value")
 *             .build());
 * 
 *         var defaultRole = new Role("defaultRole", RoleArgs.builder()
 *             .name(String.format("fcservicerole-%s", default_.result()))
 *             .document("""
 *   {
 *       "Statement": [
 *         {
 *           "Action": "sts:AssumeRole",
 *           "Effect": "Allow",
 *           "Principal": {
 *             "Service": [
 *               "fc.aliyuncs.com"
 *             ]
 *           }
 *         }
 *       ],
 *       "Version": "1"
 *   }
 *             """)
 *             .description("this is a example")
 *             .force(true)
 *             .build());
 * 
 *         var defaultRolePolicyAttachment = new RolePolicyAttachment("defaultRolePolicyAttachment", RolePolicyAttachmentArgs.builder()
 *             .roleName(defaultRole.name())
 *             .policyName("AliyunLogFullAccess")
 *             .policyType("System")
 *             .build());
 * 
 *         var defaultService = new Service("defaultService", ServiceArgs.builder()
 *             .name(String.format("example-value-%s", default_.result()))
 *             .description("example-value")
 *             .role(defaultRole.arn())
 *             .logConfig(ServiceLogConfigArgs.builder()
 *                 .project(defaultProject.projectName())
 *                 .logstore(defaultStore.logstoreName())
 *                 .enableInstanceMetrics(true)
 *                 .enableRequestMetrics(true)
 *                 .build())
 *             .build());
 * 
 *         var defaultBucket = new Bucket("defaultBucket", BucketArgs.builder()
 *             .bucket(String.format("terraform-example-%s", default_.result()))
 *             .build());
 * 
 *         // If you upload the function by OSS Bucket, you need to specify path can't upload by content.
 *         var defaultBucketObject = new BucketObject("defaultBucketObject", BucketObjectArgs.builder()
 *             .bucket(defaultBucket.id())
 *             .key("index.py")
 *             .content("""
 * import logging 
 * def handler(event, context): 
 * logger = logging.getLogger() 
 * logger.info('hello world') 
 * return 'hello world'            """)
 *             .build());
 * 
 *         var foo = new Function("foo", FunctionArgs.builder()
 *             .service(defaultService.name())
 *             .name("terraform-example")
 *             .description("example")
 *             .ossBucket(defaultBucket.id())
 *             .ossKey(defaultBucketObject.key())
 *             .memorySize(512)
 *             .runtime("python3.10")
 *             .handler("hello.handler")
 *             .environmentVariables(Map.of("prefix", "terraform"))
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
 * You can use to the existing fc module
 * to create a function quickly and set several triggers for it.
 * 
 * ## Import
 * 
 * Function Compute function can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:fc/function:Function foo my-fc-service:hello-world
 * ```
 * 
 */
@ResourceType(type="alicloud:fc/function:Function")
public class Function extends com.pulumi.resources.CustomResource {
    /**
     * The port that the function listen to, only valid for [custom runtime](https://www.alibabacloud.com/help/doc-detail/132044.htm) and [custom container runtime](https://www.alibabacloud.com/help/doc-detail/179368.htm).
     * 
     */
    @Export(name="caPort", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> caPort;

    /**
     * @return The port that the function listen to, only valid for [custom runtime](https://www.alibabacloud.com/help/doc-detail/132044.htm) and [custom container runtime](https://www.alibabacloud.com/help/doc-detail/179368.htm).
     * 
     */
    public Output<Optional<Integer>> caPort() {
        return Codegen.optional(this.caPort);
    }
    /**
     * The checksum (crc64) of the function code.Used to trigger updates.The value can be generated by data source alicloud_file_crc64_checksum.
     * &gt; **NOTE:** For more information, see [Limits](https://www.alibabacloud.com/help/doc-detail/51907.htm).
     * 
     */
    @Export(name="codeChecksum", refs={String.class}, tree="[0]")
    private Output<String> codeChecksum;

    /**
     * @return The checksum (crc64) of the function code.Used to trigger updates.The value can be generated by data source alicloud_file_crc64_checksum.
     * &gt; **NOTE:** For more information, see [Limits](https://www.alibabacloud.com/help/doc-detail/51907.htm).
     * 
     */
    public Output<String> codeChecksum() {
        return this.codeChecksum;
    }
    /**
     * The configuration for custom container runtime.See `custom_container_config` below.
     * 
     */
    @Export(name="customContainerConfig", refs={FunctionCustomContainerConfig.class}, tree="[0]")
    private Output</* @Nullable */ FunctionCustomContainerConfig> customContainerConfig;

    /**
     * @return The configuration for custom container runtime.See `custom_container_config` below.
     * 
     */
    public Output<Optional<FunctionCustomContainerConfig>> customContainerConfig() {
        return Codegen.optional(this.customContainerConfig);
    }
    /**
     * The Function Compute function description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The Function Compute function description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A map that defines environment variables for the function.
     * 
     */
    @Export(name="environmentVariables", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> environmentVariables;

    /**
     * @return A map that defines environment variables for the function.
     * 
     */
    public Output<Optional<Map<String,String>>> environmentVariables() {
        return Codegen.optional(this.environmentVariables);
    }
    /**
     * The path to the function&#39;s deployment package within the local filesystem. It is conflict with the `oss_`-prefixed options.
     * 
     */
    @Export(name="filename", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> filename;

    /**
     * @return The path to the function&#39;s deployment package within the local filesystem. It is conflict with the `oss_`-prefixed options.
     * 
     */
    public Output<Optional<String>> filename() {
        return Codegen.optional(this.filename);
    }
    /**
     * The Function Compute service function arn. It formats as `acs:fc:&lt;region&gt;:&lt;uid&gt;:services/&lt;serviceName&gt;.LATEST/functions/&lt;functionName&gt;`.
     * 
     */
    @Export(name="functionArn", refs={String.class}, tree="[0]")
    private Output<String> functionArn;

    /**
     * @return The Function Compute service function arn. It formats as `acs:fc:&lt;region&gt;:&lt;uid&gt;:services/&lt;serviceName&gt;.LATEST/functions/&lt;functionName&gt;`.
     * 
     */
    public Output<String> functionArn() {
        return this.functionArn;
    }
    /**
     * The Function Compute service function ID.
     * 
     */
    @Export(name="functionId", refs={String.class}, tree="[0]")
    private Output<String> functionId;

    /**
     * @return The Function Compute service function ID.
     * 
     */
    public Output<String> functionId() {
        return this.functionId;
    }
    /**
     * The function [entry point](https://www.alibabacloud.com/help/doc-detail/157704.htm) in your code.
     * 
     */
    @Export(name="handler", refs={String.class}, tree="[0]")
    private Output<String> handler;

    /**
     * @return The function [entry point](https://www.alibabacloud.com/help/doc-detail/157704.htm) in your code.
     * 
     */
    public Output<String> handler() {
        return this.handler;
    }
    /**
     * The maximum length of time, in seconds, that the function&#39;s initialization should be run for.
     * 
     */
    @Export(name="initializationTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> initializationTimeout;

    /**
     * @return The maximum length of time, in seconds, that the function&#39;s initialization should be run for.
     * 
     */
    public Output<Optional<Integer>> initializationTimeout() {
        return Codegen.optional(this.initializationTimeout);
    }
    /**
     * The entry point of the function&#39;s [initialization](https://www.alibabacloud.com/help/doc-detail/157704.htm).
     * 
     */
    @Export(name="initializer", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> initializer;

    /**
     * @return The entry point of the function&#39;s [initialization](https://www.alibabacloud.com/help/doc-detail/157704.htm).
     * 
     */
    public Output<Optional<String>> initializer() {
        return Codegen.optional(this.initializer);
    }
    /**
     * The maximum number of requests can be executed concurrently within the single function instance.
     * 
     */
    @Export(name="instanceConcurrency", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> instanceConcurrency;

    /**
     * @return The maximum number of requests can be executed concurrently within the single function instance.
     * 
     */
    public Output<Optional<Integer>> instanceConcurrency() {
        return Codegen.optional(this.instanceConcurrency);
    }
    /**
     * The instance type of the function.
     * 
     */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceType;

    /**
     * @return The instance type of the function.
     * 
     */
    public Output<Optional<String>> instanceType() {
        return Codegen.optional(this.instanceType);
    }
    /**
     * The date this resource was last modified.
     * 
     */
    @Export(name="lastModified", refs={String.class}, tree="[0]")
    private Output<String> lastModified;

    /**
     * @return The date this resource was last modified.
     * 
     */
    public Output<String> lastModified() {
        return this.lastModified;
    }
    /**
     * The configuration for layers.
     * 
     */
    @Export(name="layers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> layers;

    /**
     * @return The configuration for layers.
     * 
     */
    public Output<Optional<List<String>>> layers() {
        return Codegen.optional(this.layers);
    }
    /**
     * Amount of memory in MB your function can use at runtime. Defaults to `128`. Limits to [128, 32768].
     * 
     */
    @Export(name="memorySize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> memorySize;

    /**
     * @return Amount of memory in MB your function can use at runtime. Defaults to `128`. Limits to [128, 32768].
     * 
     */
    public Output<Optional<Integer>> memorySize() {
        return Codegen.optional(this.memorySize);
    }
    /**
     * The Function Compute function name. It is the only in one service and is conflict with &#34;name_prefix&#34;.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The Function Compute function name. It is the only in one service and is conflict with &#34;name_prefix&#34;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Setting a prefix to get a only function name. It is conflict with &#34;name&#34;.
     * 
     */
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return Setting a prefix to get a only function name. It is conflict with &#34;name&#34;.
     * 
     */
    public Output<Optional<String>> namePrefix() {
        return Codegen.optional(this.namePrefix);
    }
    /**
     * The OSS bucket location containing the function&#39;s deployment package. Conflicts with `filename`. This bucket must reside in the same Alibaba Cloud region where you are creating the function.
     * 
     */
    @Export(name="ossBucket", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ossBucket;

    /**
     * @return The OSS bucket location containing the function&#39;s deployment package. Conflicts with `filename`. This bucket must reside in the same Alibaba Cloud region where you are creating the function.
     * 
     */
    public Output<Optional<String>> ossBucket() {
        return Codegen.optional(this.ossBucket);
    }
    /**
     * The OSS key of an object containing the function&#39;s deployment package. Conflicts with `filename`.
     * 
     */
    @Export(name="ossKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ossKey;

    /**
     * @return The OSS key of an object containing the function&#39;s deployment package. Conflicts with `filename`.
     * 
     */
    public Output<Optional<String>> ossKey() {
        return Codegen.optional(this.ossKey);
    }
    /**
     * See [Runtimes][https://www.alibabacloud.com/help/zh/function-compute/latest/manage-functions#multiTask3514] for valid values.
     * 
     */
    @Export(name="runtime", refs={String.class}, tree="[0]")
    private Output<String> runtime;

    /**
     * @return See [Runtimes][https://www.alibabacloud.com/help/zh/function-compute/latest/manage-functions#multiTask3514] for valid values.
     * 
     */
    public Output<String> runtime() {
        return this.runtime;
    }
    /**
     * The Function Compute service name.
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output<String> service;

    /**
     * @return The Function Compute service name.
     * 
     */
    public Output<String> service() {
        return this.service;
    }
    /**
     * The amount of time your function has to run in seconds.
     * 
     */
    @Export(name="timeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeout;

    /**
     * @return The amount of time your function has to run in seconds.
     * 
     */
    public Output<Optional<Integer>> timeout() {
        return Codegen.optional(this.timeout);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Function(java.lang.String name) {
        this(name, FunctionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Function(java.lang.String name, FunctionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Function(java.lang.String name, FunctionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:fc/function:Function", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Function(java.lang.String name, Output<java.lang.String> id, @Nullable FunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:fc/function:Function", name, state, makeResourceOptions(options, id), false);
    }

    private static FunctionArgs makeArgs(FunctionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FunctionArgs.Empty : args;
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
    public static Function get(java.lang.String name, Output<java.lang.String> id, @Nullable FunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Function(name, id, state, options);
    }
}
