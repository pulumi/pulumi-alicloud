// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.hbr.PolicyBindingArgs;
import com.pulumi.alicloud.hbr.inputs.PolicyBindingState;
import com.pulumi.alicloud.hbr.outputs.PolicyBindingAdvancedOptions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a HBR Policy Binding resource. A policy binding relationship consists of a data source, a policy, and binding options.
 * 
 * For information about HBR Policy Binding and how to use it, see [What is Policy Binding](https://www.alibabacloud.com/help/en/cloud-backup/developer-reference/api-hbr-2017-09-08-createpolicybindings).
 * 
 * &gt; **NOTE:** Available since v1.221.0.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.random.integer;
 * import com.pulumi.random.IntegerArgs;
 * import com.pulumi.alicloud.hbr.Vault;
 * import com.pulumi.alicloud.hbr.VaultArgs;
 * import com.pulumi.alicloud.hbr.Policy;
 * import com.pulumi.alicloud.hbr.PolicyArgs;
 * import com.pulumi.alicloud.hbr.inputs.PolicyRuleArgs;
 * import com.pulumi.alicloud.oss.Bucket;
 * import com.pulumi.alicloud.oss.BucketArgs;
 * import com.pulumi.alicloud.hbr.PolicyBinding;
 * import com.pulumi.alicloud.hbr.PolicyBindingArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;terraform-example&#34;);
 *         var default_ = new Integer(&#34;default&#34;, IntegerArgs.builder()        
 *             .max(99999)
 *             .min(10000)
 *             .build());
 * 
 *         var defaultyk84Hc = new Vault(&#34;defaultyk84Hc&#34;, VaultArgs.builder()        
 *             .vaultType(&#34;STANDARD&#34;)
 *             .vaultName(String.format(&#34;example-value-%s&#34;, default_.result()))
 *             .build());
 * 
 *         var defaultoqWvHQ = new Policy(&#34;defaultoqWvHQ&#34;, PolicyArgs.builder()        
 *             .policyName(String.format(&#34;example-value-%s&#34;, default_.result()))
 *             .rules(PolicyRuleArgs.builder()
 *                 .ruleType(&#34;BACKUP&#34;)
 *                 .backupType(&#34;COMPLETE&#34;)
 *                 .schedule(&#34;I|1631685600|P1D&#34;)
 *                 .retention(&#34;7&#34;)
 *                 .archiveDays(&#34;0&#34;)
 *                 .vaultId(defaultyk84Hc.id())
 *                 .build())
 *             .policyDescription(&#34;policy example&#34;)
 *             .build());
 * 
 *         var defaultKtt2XY = new Bucket(&#34;defaultKtt2XY&#34;, BucketArgs.builder()        
 *             .storageClass(&#34;Standard&#34;)
 *             .bucket(String.format(&#34;example-value-%s&#34;, default_.result()))
 *             .build());
 * 
 *         var defaultPolicyBinding = new PolicyBinding(&#34;defaultPolicyBinding&#34;, PolicyBindingArgs.builder()        
 *             .sourceType(&#34;OSS&#34;)
 *             .disabled(&#34;false&#34;)
 *             .policyId(defaultoqWvHQ.id())
 *             .dataSourceId(defaultKtt2XY.bucket())
 *             .policyBindingDescription(&#34;policy binding example (update)&#34;)
 *             .source(&#34;prefix-example-update/&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * HBR Policy Binding can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:hbr/policyBinding:PolicyBinding example &lt;policy_id&gt;:&lt;source_type&gt;:&lt;data_source_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:hbr/policyBinding:PolicyBinding")
public class PolicyBinding extends com.pulumi.resources.CustomResource {
    /**
     * Backup Advanced Options. See `advanced_options` below.
     * 
     */
    @Export(name="advancedOptions", refs={PolicyBindingAdvancedOptions.class}, tree="[0]")
    private Output<PolicyBindingAdvancedOptions> advancedOptions;

    /**
     * @return Backup Advanced Options. See `advanced_options` below.
     * 
     */
    public Output<PolicyBindingAdvancedOptions> advancedOptions() {
        return this.advancedOptions;
    }
    /**
     * The creation time of the resource.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The data source ID.
     * 
     */
    @Export(name="dataSourceId", refs={String.class}, tree="[0]")
    private Output<String> dataSourceId;

    /**
     * @return The data source ID.
     * 
     */
    public Output<String> dataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Whether the policy is effective for the data source.
     * - true: Pause
     * - false: not paused.
     * 
     */
    @Export(name="disabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return Whether the policy is effective for the data source.
     * - true: Pause
     * - false: not paused.
     * 
     */
    public Output<Optional<Boolean>> disabled() {
        return Codegen.optional(this.disabled);
    }
    /**
     * This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates a file type that does not need to be backed up. All files of this type are not backed up. A maximum of 255 characters is supported.
     * 
     */
    @Export(name="exclude", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> exclude;

    /**
     * @return This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates a file type that does not need to be backed up. All files of this type are not backed up. A maximum of 255 characters is supported.
     * 
     */
    public Output<Optional<String>> exclude() {
        return Codegen.optional(this.exclude);
    }
    /**
     * This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates the file types to be backed up, and all files of these types are backed up. A maximum of 255 characters is supported.
     * 
     */
    @Export(name="include", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> include;

    /**
     * @return This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates the file types to be backed up, and all files of these types are backed up. A maximum of 255 characters is supported.
     * 
     */
    public Output<Optional<String>> include() {
        return Codegen.optional(this.include);
    }
    /**
     * Resource Description.
     * 
     */
    @Export(name="policyBindingDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policyBindingDescription;

    /**
     * @return Resource Description.
     * 
     */
    public Output<Optional<String>> policyBindingDescription() {
        return Codegen.optional(this.policyBindingDescription);
    }
    /**
     * The policy ID.
     * 
     */
    @Export(name="policyId", refs={String.class}, tree="[0]")
    private Output<String> policyId;

    /**
     * @return The policy ID.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }
    /**
     * When SourceType is OSS, a prefix is specified to be backed up. If it is not specified, the entire root directory of the Bucket is backed up.
     * 
     */
    @Export(name="source", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> source;

    /**
     * @return When SourceType is OSS, a prefix is specified to be backed up. If it is not specified, the entire root directory of the Bucket is backed up.
     * 
     */
    public Output<Optional<String>> source() {
        return Codegen.optional(this.source);
    }
    /**
     * Data source type, value range:
     * - **UDM_ECS**: indicates the ECS instance backup.
     * - **OSS**: indicates an OSS backup.
     * - **NAS**: indicates an Alibaba Cloud NAS Backup. When you bind a file system to a policy, Cloud Backup automatically creates a mount point for the file system. If you no longer need the mount point, delete it manually.
     * - **ECS_FILE**: indicates that the ECS file is backed up.
     * - **File**: indicates a local File backup.
     * 
     */
    @Export(name="sourceType", refs={String.class}, tree="[0]")
    private Output<String> sourceType;

    /**
     * @return Data source type, value range:
     * - **UDM_ECS**: indicates the ECS instance backup.
     * - **OSS**: indicates an OSS backup.
     * - **NAS**: indicates an Alibaba Cloud NAS Backup. When you bind a file system to a policy, Cloud Backup automatically creates a mount point for the file system. If you no longer need the mount point, delete it manually.
     * - **ECS_FILE**: indicates that the ECS file is backed up.
     * - **File**: indicates a local File backup.
     * 
     */
    public Output<String> sourceType() {
        return this.sourceType;
    }
    /**
     * This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates backup flow control. The format is {start}{end}{bandwidth}. Multiple flow control configurations use partitioning, and no overlap in configuration time is allowed. start: start hour. end: end of hour. bandwidth: limit rate, in KB/s.
     * 
     */
    @Export(name="speedLimit", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> speedLimit;

    /**
     * @return This parameter is required only when the value of SourceType is ECS_FILE or File. Indicates backup flow control. The format is {start}{end}{bandwidth}. Multiple flow control configurations use partitioning, and no overlap in configuration time is allowed. start: start hour. end: end of hour. bandwidth: limit rate, in KB/s.
     * 
     */
    public Output<Optional<String>> speedLimit() {
        return Codegen.optional(this.speedLimit);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyBinding(String name) {
        this(name, PolicyBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyBinding(String name, @Nullable PolicyBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyBinding(String name, @Nullable PolicyBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:hbr/policyBinding:PolicyBinding", name, args == null ? PolicyBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PolicyBinding(String name, Output<String> id, @Nullable PolicyBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:hbr/policyBinding:PolicyBinding", name, state, makeResourceOptions(options, id));
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
    public static PolicyBinding get(String name, Output<String> id, @Nullable PolicyBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PolicyBinding(name, id, state, options);
    }
}