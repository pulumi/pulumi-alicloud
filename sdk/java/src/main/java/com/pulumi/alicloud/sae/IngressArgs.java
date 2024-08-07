// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae;

import com.pulumi.alicloud.sae.inputs.IngressDefaultRuleArgs;
import com.pulumi.alicloud.sae.inputs.IngressRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IngressArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressArgs Empty = new IngressArgs();

    /**
     * The certificate ID of the HTTPS listener. The `cert_id` takes effect only when `load_balance_type` is set to `clb`.
     * 
     */
    @Import(name="certId")
    private @Nullable Output<String> certId;

    /**
     * @return The certificate ID of the HTTPS listener. The `cert_id` takes effect only when `load_balance_type` is set to `clb`.
     * 
     */
    public Optional<Output<String>> certId() {
        return Optional.ofNullable(this.certId);
    }

    /**
     * The certificate IDs of the HTTPS listener, and multiple certificate IDs are separated by commas. The `cert_ids` takes effect only when `load_balance_type` is set to `alb`.
     * 
     */
    @Import(name="certIds")
    private @Nullable Output<String> certIds;

    /**
     * @return The certificate IDs of the HTTPS listener, and multiple certificate IDs are separated by commas. The `cert_ids` takes effect only when `load_balance_type` is set to `alb`.
     * 
     */
    public Optional<Output<String>> certIds() {
        return Optional.ofNullable(this.certIds);
    }

    /**
     * Default Rule. See `default_rule` below.
     * 
     */
    @Import(name="defaultRule")
    private @Nullable Output<IngressDefaultRuleArgs> defaultRule;

    /**
     * @return Default Rule. See `default_rule` below.
     * 
     */
    public Optional<Output<IngressDefaultRuleArgs>> defaultRule() {
        return Optional.ofNullable(this.defaultRule);
    }

    /**
     * Description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * SLB listening port.
     * 
     */
    @Import(name="listenerPort", required=true)
    private Output<Integer> listenerPort;

    /**
     * @return SLB listening port.
     * 
     */
    public Output<Integer> listenerPort() {
        return this.listenerPort;
    }

    /**
     * The protocol that is used to forward requests. Default value: `HTTP`. Valid values: `HTTP`, `HTTPS`.
     * 
     */
    @Import(name="listenerProtocol")
    private @Nullable Output<String> listenerProtocol;

    /**
     * @return The protocol that is used to forward requests. Default value: `HTTP`. Valid values: `HTTP`, `HTTPS`.
     * 
     */
    public Optional<Output<String>> listenerProtocol() {
        return Optional.ofNullable(this.listenerProtocol);
    }

    /**
     * The type of the SLB instance. Default value: `clb`. Valid values: `clb`, `alb`.
     * 
     */
    @Import(name="loadBalanceType")
    private @Nullable Output<String> loadBalanceType;

    /**
     * @return The type of the SLB instance. Default value: `clb`. Valid values: `clb`, `alb`.
     * 
     */
    public Optional<Output<String>> loadBalanceType() {
        return Optional.ofNullable(this.loadBalanceType);
    }

    /**
     * The ID of Namespace. It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`.
     * 
     */
    @Import(name="namespaceId", required=true)
    private Output<String> namespaceId;

    /**
     * @return The ID of Namespace. It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`.
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }

    /**
     * Forwarding rules. Forward traffic to the specified application according to the domain name and path. See `rules` below.
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<IngressRuleArgs>> rules;

    /**
     * @return Forwarding rules. Forward traffic to the specified application according to the domain name and path. See `rules` below.
     * 
     */
    public Output<List<IngressRuleArgs>> rules() {
        return this.rules;
    }

    /**
     * SLB ID.
     * 
     */
    @Import(name="slbId", required=true)
    private Output<String> slbId;

    /**
     * @return SLB ID.
     * 
     */
    public Output<String> slbId() {
        return this.slbId;
    }

    private IngressArgs() {}

    private IngressArgs(IngressArgs $) {
        this.certId = $.certId;
        this.certIds = $.certIds;
        this.defaultRule = $.defaultRule;
        this.description = $.description;
        this.listenerPort = $.listenerPort;
        this.listenerProtocol = $.listenerProtocol;
        this.loadBalanceType = $.loadBalanceType;
        this.namespaceId = $.namespaceId;
        this.rules = $.rules;
        this.slbId = $.slbId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressArgs $;

        public Builder() {
            $ = new IngressArgs();
        }

        public Builder(IngressArgs defaults) {
            $ = new IngressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certId The certificate ID of the HTTPS listener. The `cert_id` takes effect only when `load_balance_type` is set to `clb`.
         * 
         * @return builder
         * 
         */
        public Builder certId(@Nullable Output<String> certId) {
            $.certId = certId;
            return this;
        }

        /**
         * @param certId The certificate ID of the HTTPS listener. The `cert_id` takes effect only when `load_balance_type` is set to `clb`.
         * 
         * @return builder
         * 
         */
        public Builder certId(String certId) {
            return certId(Output.of(certId));
        }

        /**
         * @param certIds The certificate IDs of the HTTPS listener, and multiple certificate IDs are separated by commas. The `cert_ids` takes effect only when `load_balance_type` is set to `alb`.
         * 
         * @return builder
         * 
         */
        public Builder certIds(@Nullable Output<String> certIds) {
            $.certIds = certIds;
            return this;
        }

        /**
         * @param certIds The certificate IDs of the HTTPS listener, and multiple certificate IDs are separated by commas. The `cert_ids` takes effect only when `load_balance_type` is set to `alb`.
         * 
         * @return builder
         * 
         */
        public Builder certIds(String certIds) {
            return certIds(Output.of(certIds));
        }

        /**
         * @param defaultRule Default Rule. See `default_rule` below.
         * 
         * @return builder
         * 
         */
        public Builder defaultRule(@Nullable Output<IngressDefaultRuleArgs> defaultRule) {
            $.defaultRule = defaultRule;
            return this;
        }

        /**
         * @param defaultRule Default Rule. See `default_rule` below.
         * 
         * @return builder
         * 
         */
        public Builder defaultRule(IngressDefaultRuleArgs defaultRule) {
            return defaultRule(Output.of(defaultRule));
        }

        /**
         * @param description Description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param listenerPort SLB listening port.
         * 
         * @return builder
         * 
         */
        public Builder listenerPort(Output<Integer> listenerPort) {
            $.listenerPort = listenerPort;
            return this;
        }

        /**
         * @param listenerPort SLB listening port.
         * 
         * @return builder
         * 
         */
        public Builder listenerPort(Integer listenerPort) {
            return listenerPort(Output.of(listenerPort));
        }

        /**
         * @param listenerProtocol The protocol that is used to forward requests. Default value: `HTTP`. Valid values: `HTTP`, `HTTPS`.
         * 
         * @return builder
         * 
         */
        public Builder listenerProtocol(@Nullable Output<String> listenerProtocol) {
            $.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * @param listenerProtocol The protocol that is used to forward requests. Default value: `HTTP`. Valid values: `HTTP`, `HTTPS`.
         * 
         * @return builder
         * 
         */
        public Builder listenerProtocol(String listenerProtocol) {
            return listenerProtocol(Output.of(listenerProtocol));
        }

        /**
         * @param loadBalanceType The type of the SLB instance. Default value: `clb`. Valid values: `clb`, `alb`.
         * 
         * @return builder
         * 
         */
        public Builder loadBalanceType(@Nullable Output<String> loadBalanceType) {
            $.loadBalanceType = loadBalanceType;
            return this;
        }

        /**
         * @param loadBalanceType The type of the SLB instance. Default value: `clb`. Valid values: `clb`, `alb`.
         * 
         * @return builder
         * 
         */
        public Builder loadBalanceType(String loadBalanceType) {
            return loadBalanceType(Output.of(loadBalanceType));
        }

        /**
         * @param namespaceId The ID of Namespace. It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId The ID of Namespace. It can contain 2 to 32 lowercase characters.The value is in format `{RegionId}:{namespace}`.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param rules Forwarding rules. Forward traffic to the specified application according to the domain name and path. See `rules` below.
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<IngressRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Forwarding rules. Forward traffic to the specified application according to the domain name and path. See `rules` below.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<IngressRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Forwarding rules. Forward traffic to the specified application according to the domain name and path. See `rules` below.
         * 
         * @return builder
         * 
         */
        public Builder rules(IngressRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param slbId SLB ID.
         * 
         * @return builder
         * 
         */
        public Builder slbId(Output<String> slbId) {
            $.slbId = slbId;
            return this;
        }

        /**
         * @param slbId SLB ID.
         * 
         * @return builder
         * 
         */
        public Builder slbId(String slbId) {
            return slbId(Output.of(slbId));
        }

        public IngressArgs build() {
            if ($.listenerPort == null) {
                throw new MissingRequiredPropertyException("IngressArgs", "listenerPort");
            }
            if ($.namespaceId == null) {
                throw new MissingRequiredPropertyException("IngressArgs", "namespaceId");
            }
            if ($.rules == null) {
                throw new MissingRequiredPropertyException("IngressArgs", "rules");
            }
            if ($.slbId == null) {
                throw new MissingRequiredPropertyException("IngressArgs", "slbId");
            }
            return $;
        }
    }

}
