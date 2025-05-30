// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.quotas;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.quotas.TemplateQuotaArgs;
import com.pulumi.alicloud.quotas.inputs.TemplateQuotaState;
import com.pulumi.alicloud.quotas.outputs.TemplateQuotaDimension;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Quotas Template Quota resource.
 * 
 * For information about Quotas Template Quota and how to use it, see [What is Template Quota](https://www.alibabacloud.com/help/en/quota-center/developer-reference/api-quotas-2020-05-10-createtemplatequotaitem).
 * 
 * &gt; **NOTE:** Available since v1.206.0.
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
 * import com.pulumi.alicloud.quotas.TemplateQuota;
 * import com.pulumi.alicloud.quotas.TemplateQuotaArgs;
 * import com.pulumi.alicloud.quotas.inputs.TemplateQuotaDimensionArgs;
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
 *         var default_ = new TemplateQuota("default", TemplateQuotaArgs.builder()
 *             .quotaActionCode("q_desktop-count")
 *             .productCode("gws")
 *             .noticeType(3)
 *             .dimensions(TemplateQuotaDimensionArgs.builder()
 *                 .key("regionId")
 *                 .value("cn-hangzhou")
 *                 .build())
 *             .desireValue(1001.0)
 *             .envLanguage("zh")
 *             .quotaCategory("CommonQuota")
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
 * Quotas Template Quota can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:quotas/templateQuota:TemplateQuota example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:quotas/templateQuota:TemplateQuota")
public class TemplateQuota extends com.pulumi.resources.CustomResource {
    /**
     * Quota application value.
     * 
     */
    @Export(name="desireValue", refs={Double.class}, tree="[0]")
    private Output<Double> desireValue;

    /**
     * @return Quota application value.
     * 
     */
    public Output<Double> desireValue() {
        return this.desireValue;
    }
    /**
     * The Quota Dimensions. See `dimensions` below.
     * 
     */
    @Export(name="dimensions", refs={List.class,TemplateQuotaDimension.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TemplateQuotaDimension>> dimensions;

    /**
     * @return The Quota Dimensions. See `dimensions` below.
     * 
     */
    public Output<Optional<List<TemplateQuotaDimension>>> dimensions() {
        return Codegen.optional(this.dimensions);
    }
    /**
     * The UTC time when the quota takes effect.
     * 
     */
    @Export(name="effectiveTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> effectiveTime;

    /**
     * @return The UTC time when the quota takes effect.
     * 
     */
    public Output<Optional<String>> effectiveTime() {
        return Codegen.optional(this.effectiveTime);
    }
    /**
     * The language of the quota alert notification. Value:
     * - zh: Chinese.
     * - en: English.
     * 
     */
    @Export(name="envLanguage", refs={String.class}, tree="[0]")
    private Output<String> envLanguage;

    /**
     * @return The language of the quota alert notification. Value:
     * - zh: Chinese.
     * - en: English.
     * 
     */
    public Output<String> envLanguage() {
        return this.envLanguage;
    }
    /**
     * The UTC time when the quota expires.
     * 
     */
    @Export(name="expireTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expireTime;

    /**
     * @return The UTC time when the quota expires.
     * 
     */
    public Output<Optional<String>> expireTime() {
        return Codegen.optional(this.expireTime);
    }
    /**
     * Whether to notify the result of quota promotion application. Value:
     * - 0: No.
     * - 3: Yes.
     * 
     */
    @Export(name="noticeType", refs={Integer.class}, tree="[0]")
    private Output<Integer> noticeType;

    /**
     * @return Whether to notify the result of quota promotion application. Value:
     * - 0: No.
     * - 3: Yes.
     * 
     */
    public Output<Integer> noticeType() {
        return this.noticeType;
    }
    /**
     * The abbreviation of the cloud service name.
     * 
     */
    @Export(name="productCode", refs={String.class}, tree="[0]")
    private Output<String> productCode;

    /**
     * @return The abbreviation of the cloud service name.
     * 
     */
    public Output<String> productCode() {
        return this.productCode;
    }
    /**
     * The quota ID.
     * 
     */
    @Export(name="quotaActionCode", refs={String.class}, tree="[0]")
    private Output<String> quotaActionCode;

    /**
     * @return The quota ID.
     * 
     */
    public Output<String> quotaActionCode() {
        return this.quotaActionCode;
    }
    /**
     * Type of quota. Value:
     * - CommonQuota : Generic quota.
     * - WhiteListLabel: Equity quota.
     * - FlowControl:API rate quota.
     * 
     */
    @Export(name="quotaCategory", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> quotaCategory;

    /**
     * @return Type of quota. Value:
     * - CommonQuota : Generic quota.
     * - WhiteListLabel: Equity quota.
     * - FlowControl:API rate quota.
     * 
     */
    public Output<Optional<String>> quotaCategory() {
        return Codegen.optional(this.quotaCategory);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TemplateQuota(java.lang.String name) {
        this(name, TemplateQuotaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TemplateQuota(java.lang.String name, TemplateQuotaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TemplateQuota(java.lang.String name, TemplateQuotaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:quotas/templateQuota:TemplateQuota", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TemplateQuota(java.lang.String name, Output<java.lang.String> id, @Nullable TemplateQuotaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:quotas/templateQuota:TemplateQuota", name, state, makeResourceOptions(options, id), false);
    }

    private static TemplateQuotaArgs makeArgs(TemplateQuotaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TemplateQuotaArgs.Empty : args;
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
    public static TemplateQuota get(java.lang.String name, Output<java.lang.String> id, @Nullable TemplateQuotaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TemplateQuota(name, id, state, options);
    }
}
