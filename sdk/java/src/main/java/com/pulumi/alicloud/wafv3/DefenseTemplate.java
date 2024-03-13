// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.wafv3;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.wafv3.DefenseTemplateArgs;
import com.pulumi.alicloud.wafv3.inputs.DefenseTemplateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a WAFV3 Defense Template resource.
 * 
 * For information about WAFV3 Defense Template and how to use it, see [What is Defense Template](https://www.alibabacloud.com/help/en/web-application-firewall/latest/api-waf-openapi-2021-10-01-createdefensetemplate).
 * 
 * &gt; **NOTE:** Available since v1.218.0.
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
 * import com.pulumi.alicloud.wafv3.Wafv3Functions;
 * import com.pulumi.alicloud.wafv3.inputs.GetInstancesArgs;
 * import com.pulumi.alicloud.wafv3.DefenseTemplate;
 * import com.pulumi.alicloud.wafv3.DefenseTemplateArgs;
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
 *         final var defaultInstances = Wafv3Functions.getInstances();
 * 
 *         var defaultDefenseTemplate = new DefenseTemplate(&#34;defaultDefenseTemplate&#34;, DefenseTemplateArgs.builder()        
 *             .status(&#34;1&#34;)
 *             .instanceId(defaultInstances.applyValue(getInstancesResult -&gt; getInstancesResult.ids()[0]))
 *             .defenseTemplateName(name)
 *             .templateType(&#34;user_custom&#34;)
 *             .templateOrigin(&#34;custom&#34;)
 *             .defenseScene(&#34;antiscan&#34;)
 *             .resourceManagerResourceGroupId(&#34;example&#34;)
 *             .description(name)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * WAFV3 Defense Template can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:wafv3/defenseTemplate:DefenseTemplate example &lt;instance_id&gt;:&lt;defense_template_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:wafv3/defenseTemplate:DefenseTemplate")
public class DefenseTemplate extends com.pulumi.resources.CustomResource {
    /**
     * The module to which the protection rule that you want to create belongs. Value:
     * - **waf_group**: the basic protection rule module.
     * - **antiscan**: the scan protection module.
     * - **ip_blacklist**: the IP address blacklist module.
     * - **custom_acl**: the custom rule module.
     * - **whitelist**: the whitelist module.
     * - **region_block**: the region blacklist module.
     * - **custom_response**: the custom response module.
     * - **cc**: the HTTP flood protection module.
     * - **tamperproof**: the website tamper-proofing module.
     * - **dlp**: the data leakage prevention module.
     * 
     */
    @Export(name="defenseScene", refs={String.class}, tree="[0]")
    private Output<String> defenseScene;

    /**
     * @return The module to which the protection rule that you want to create belongs. Value:
     * - **waf_group**: the basic protection rule module.
     * - **antiscan**: the scan protection module.
     * - **ip_blacklist**: the IP address blacklist module.
     * - **custom_acl**: the custom rule module.
     * - **whitelist**: the whitelist module.
     * - **region_block**: the region blacklist module.
     * - **custom_response**: the custom response module.
     * - **cc**: the HTTP flood protection module.
     * - **tamperproof**: the website tamper-proofing module.
     * - **dlp**: the data leakage prevention module.
     * 
     */
    public Output<String> defenseScene() {
        return this.defenseScene;
    }
    /**
     * Template ID.
     * 
     */
    @Export(name="defenseTemplateId", refs={Integer.class}, tree="[0]")
    private Output<Integer> defenseTemplateId;

    /**
     * @return Template ID.
     * 
     */
    public Output<Integer> defenseTemplateId() {
        return this.defenseTemplateId;
    }
    /**
     * The name of the protection rule template.
     * 
     */
    @Export(name="defenseTemplateName", refs={String.class}, tree="[0]")
    private Output<String> defenseTemplateName;

    /**
     * @return The name of the protection rule template.
     * 
     */
    public Output<String> defenseTemplateName() {
        return this.defenseTemplateName;
    }
    /**
     * The description of the protection rule template. .
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the protection rule template. .
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the Web Application Firewall (WAF) instance. .
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The ID of the Web Application Firewall (WAF) instance. .
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The ID of the Alibaba Cloud resource group. .
     * 
     */
    @Export(name="resourceManagerResourceGroupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resourceManagerResourceGroupId;

    /**
     * @return The ID of the Alibaba Cloud resource group. .
     * 
     */
    public Output<Optional<String>> resourceManagerResourceGroupId() {
        return Codegen.optional(this.resourceManagerResourceGroupId);
    }
    /**
     * The status of the protection rule template. Valid values:
     * - **0**: disabled.
     * - **1**: enabled.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the protection rule template. Valid values:
     * - **0**: disabled.
     * - **1**: enabled.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The origin of the protection rule template that you want to create. Set the value to **custom**. The value specifies that the protection rule template is a custom template. .
     * 
     */
    @Export(name="templateOrigin", refs={String.class}, tree="[0]")
    private Output<String> templateOrigin;

    /**
     * @return The origin of the protection rule template that you want to create. Set the value to **custom**. The value specifies that the protection rule template is a custom template. .
     * 
     */
    public Output<String> templateOrigin() {
        return this.templateOrigin;
    }
    /**
     * The type of the protection rule template. Valid values:
     * - **user_default:** default template.
     * - **user_custom:** custom template.
     * 
     */
    @Export(name="templateType", refs={String.class}, tree="[0]")
    private Output<String> templateType;

    /**
     * @return The type of the protection rule template. Valid values:
     * - **user_default:** default template.
     * - **user_custom:** custom template.
     * 
     */
    public Output<String> templateType() {
        return this.templateType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefenseTemplate(String name) {
        this(name, DefenseTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefenseTemplate(String name, DefenseTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefenseTemplate(String name, DefenseTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:wafv3/defenseTemplate:DefenseTemplate", name, args == null ? DefenseTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DefenseTemplate(String name, Output<String> id, @Nullable DefenseTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:wafv3/defenseTemplate:DefenseTemplate", name, state, makeResourceOptions(options, id));
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
    public static DefenseTemplate get(String name, Output<String> id, @Nullable DefenseTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DefenseTemplate(name, id, state, options);
    }
}