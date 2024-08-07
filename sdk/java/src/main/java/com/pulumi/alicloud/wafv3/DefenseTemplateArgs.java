// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.wafv3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefenseTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefenseTemplateArgs Empty = new DefenseTemplateArgs();

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
    @Import(name="defenseScene", required=true)
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
     * The name of the protection rule template.
     * 
     */
    @Import(name="defenseTemplateName", required=true)
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
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the protection rule template. .
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the Web Application Firewall (WAF) instance. .
     * 
     */
    @Import(name="instanceId", required=true)
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
    @Import(name="resourceManagerResourceGroupId")
    private @Nullable Output<String> resourceManagerResourceGroupId;

    /**
     * @return The ID of the Alibaba Cloud resource group. .
     * 
     */
    public Optional<Output<String>> resourceManagerResourceGroupId() {
        return Optional.ofNullable(this.resourceManagerResourceGroupId);
    }

    /**
     * The status of the protection rule template. Valid values:
     * - **0**: disabled.
     * - **1**: enabled.
     * 
     */
    @Import(name="status", required=true)
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
    @Import(name="templateOrigin", required=true)
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
    @Import(name="templateType", required=true)
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

    private DefenseTemplateArgs() {}

    private DefenseTemplateArgs(DefenseTemplateArgs $) {
        this.defenseScene = $.defenseScene;
        this.defenseTemplateName = $.defenseTemplateName;
        this.description = $.description;
        this.instanceId = $.instanceId;
        this.resourceManagerResourceGroupId = $.resourceManagerResourceGroupId;
        this.status = $.status;
        this.templateOrigin = $.templateOrigin;
        this.templateType = $.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefenseTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefenseTemplateArgs $;

        public Builder() {
            $ = new DefenseTemplateArgs();
        }

        public Builder(DefenseTemplateArgs defaults) {
            $ = new DefenseTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defenseScene The module to which the protection rule that you want to create belongs. Value:
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
         * @return builder
         * 
         */
        public Builder defenseScene(Output<String> defenseScene) {
            $.defenseScene = defenseScene;
            return this;
        }

        /**
         * @param defenseScene The module to which the protection rule that you want to create belongs. Value:
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
         * @return builder
         * 
         */
        public Builder defenseScene(String defenseScene) {
            return defenseScene(Output.of(defenseScene));
        }

        /**
         * @param defenseTemplateName The name of the protection rule template.
         * 
         * @return builder
         * 
         */
        public Builder defenseTemplateName(Output<String> defenseTemplateName) {
            $.defenseTemplateName = defenseTemplateName;
            return this;
        }

        /**
         * @param defenseTemplateName The name of the protection rule template.
         * 
         * @return builder
         * 
         */
        public Builder defenseTemplateName(String defenseTemplateName) {
            return defenseTemplateName(Output.of(defenseTemplateName));
        }

        /**
         * @param description The description of the protection rule template. .
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the protection rule template. .
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param instanceId The ID of the Web Application Firewall (WAF) instance. .
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the Web Application Firewall (WAF) instance. .
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param resourceManagerResourceGroupId The ID of the Alibaba Cloud resource group. .
         * 
         * @return builder
         * 
         */
        public Builder resourceManagerResourceGroupId(@Nullable Output<String> resourceManagerResourceGroupId) {
            $.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * @param resourceManagerResourceGroupId The ID of the Alibaba Cloud resource group. .
         * 
         * @return builder
         * 
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            return resourceManagerResourceGroupId(Output.of(resourceManagerResourceGroupId));
        }

        /**
         * @param status The status of the protection rule template. Valid values:
         * - **0**: disabled.
         * - **1**: enabled.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the protection rule template. Valid values:
         * - **0**: disabled.
         * - **1**: enabled.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param templateOrigin The origin of the protection rule template that you want to create. Set the value to **custom**. The value specifies that the protection rule template is a custom template. .
         * 
         * @return builder
         * 
         */
        public Builder templateOrigin(Output<String> templateOrigin) {
            $.templateOrigin = templateOrigin;
            return this;
        }

        /**
         * @param templateOrigin The origin of the protection rule template that you want to create. Set the value to **custom**. The value specifies that the protection rule template is a custom template. .
         * 
         * @return builder
         * 
         */
        public Builder templateOrigin(String templateOrigin) {
            return templateOrigin(Output.of(templateOrigin));
        }

        /**
         * @param templateType The type of the protection rule template. Valid values:
         * - **user_default:** default template.
         * - **user_custom:** custom template.
         * 
         * @return builder
         * 
         */
        public Builder templateType(Output<String> templateType) {
            $.templateType = templateType;
            return this;
        }

        /**
         * @param templateType The type of the protection rule template. Valid values:
         * - **user_default:** default template.
         * - **user_custom:** custom template.
         * 
         * @return builder
         * 
         */
        public Builder templateType(String templateType) {
            return templateType(Output.of(templateType));
        }

        public DefenseTemplateArgs build() {
            if ($.defenseScene == null) {
                throw new MissingRequiredPropertyException("DefenseTemplateArgs", "defenseScene");
            }
            if ($.defenseTemplateName == null) {
                throw new MissingRequiredPropertyException("DefenseTemplateArgs", "defenseTemplateName");
            }
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("DefenseTemplateArgs", "instanceId");
            }
            if ($.status == null) {
                throw new MissingRequiredPropertyException("DefenseTemplateArgs", "status");
            }
            if ($.templateOrigin == null) {
                throw new MissingRequiredPropertyException("DefenseTemplateArgs", "templateOrigin");
            }
            if ($.templateType == null) {
                throw new MissingRequiredPropertyException("DefenseTemplateArgs", "templateType");
            }
            return $;
        }
    }

}
