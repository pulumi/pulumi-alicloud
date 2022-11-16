// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ddos.SchedulerRuleArgs;
import com.pulumi.alicloud.ddos.inputs.SchedulerRuleState;
import com.pulumi.alicloud.ddos.outputs.SchedulerRuleRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DdosCoo Scheduler Rule resource. For information about DdosCoo Scheduler Rule and how to use it, see[What is DdosCoo Scheduler Rule](https://www.alibabacloud.com/help/en/doc-detail/157481.htm).
 * 
 * &gt; **NOTE:** Available in 1.86.0+
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
 * import com.pulumi.alicloud.ddos.SchedulerRule;
 * import com.pulumi.alicloud.ddos.SchedulerRuleArgs;
 * import com.pulumi.alicloud.ddos.inputs.SchedulerRuleRuleArgs;
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
 *         var example = new SchedulerRule(&#34;example&#34;, SchedulerRuleArgs.builder()        
 *             .ruleName(&#34;tf-testacc7929727&#34;)
 *             .ruleType(3)
 *             .rules(            
 *                 SchedulerRuleRuleArgs.builder()
 *                     .priority(100)
 *                     .regionId(&#34;cn-hangzhou&#34;)
 *                     .type(&#34;A&#34;)
 *                     .value(&#34;127.0.0.1&#34;)
 *                     .valueType(3)
 *                     .build(),
 *                 SchedulerRuleRuleArgs.builder()
 *                     .priority(50)
 *                     .regionId(&#34;cn-hangzhou&#34;)
 *                     .type(&#34;A&#34;)
 *                     .value(&#34;127.0.0.0&#34;)
 *                     .valueType(1)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * DdosCoo Scheduler Rule can be imported using the id or the rule name, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ddos/schedulerRule:SchedulerRule example fbb20dc77e8fc******
 * ```
 * 
 */
@ResourceType(type="alicloud:ddos/schedulerRule:SchedulerRule")
public class SchedulerRule extends com.pulumi.resources.CustomResource {
    /**
     * The cname is the traffic scheduler corresponding to rules.
     * 
     */
    @Export(name="cname", type=String.class, parameters={})
    private Output<String> cname;

    /**
     * @return The cname is the traffic scheduler corresponding to rules.
     * 
     */
    public Output<String> cname() {
        return this.cname;
    }
    /**
     * The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
     * 
     */
    @Export(name="param", type=String.class, parameters={})
    private Output</* @Nullable */ String> param;

    /**
     * @return The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
     * 
     */
    public Output<Optional<String>> param() {
        return Codegen.optional(this.param);
    }
    /**
     * The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroupId;

    /**
     * @return The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
     * 
     */
    public Output<Optional<String>> resourceGroupId() {
        return Codegen.optional(this.resourceGroupId);
    }
    /**
     * The name of the rule.
     * 
     */
    @Export(name="ruleName", type=String.class, parameters={})
    private Output<String> ruleName;

    /**
     * @return The name of the rule.
     * 
     */
    public Output<String> ruleName() {
        return this.ruleName;
    }
    /**
     * The rule type. Valid values:
     * `2`: tiered protection.
     * `3`: globalization acceleration.
     * `6`: Cloud product interaction.
     * 
     */
    @Export(name="ruleType", type=Integer.class, parameters={})
    private Output<Integer> ruleType;

    /**
     * @return The rule type. Valid values:
     * `2`: tiered protection.
     * `3`: globalization acceleration.
     * `6`: Cloud product interaction.
     * 
     */
    public Output<Integer> ruleType() {
        return this.ruleType;
    }
    /**
     * The information about the scheduling rules. See the following `Block rules`.
     * 
     */
    @Export(name="rules", type=List.class, parameters={SchedulerRuleRule.class})
    private Output<List<SchedulerRuleRule>> rules;

    /**
     * @return The information about the scheduling rules. See the following `Block rules`.
     * 
     */
    public Output<List<SchedulerRuleRule>> rules() {
        return this.rules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SchedulerRule(String name) {
        this(name, SchedulerRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SchedulerRule(String name, SchedulerRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SchedulerRule(String name, SchedulerRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ddos/schedulerRule:SchedulerRule", name, args == null ? SchedulerRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SchedulerRule(String name, Output<String> id, @Nullable SchedulerRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ddos/schedulerRule:SchedulerRule", name, state, makeResourceOptions(options, id));
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
    public static SchedulerRule get(String name, Output<String> id, @Nullable SchedulerRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SchedulerRule(name, id, state, options);
    }
}