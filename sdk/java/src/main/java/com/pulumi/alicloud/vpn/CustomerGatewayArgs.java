// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomerGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomerGatewayArgs Empty = new CustomerGatewayArgs();

    /**
     * Asn.
     * 
     */
    @Import(name="asn")
    private @Nullable Output<String> asn;

    /**
     * @return Asn.
     * 
     */
    public Optional<Output<String>> asn() {
        return Optional.ofNullable(this.asn);
    }

    /**
     * The name of the customer gateway.
     * 
     */
    @Import(name="customerGatewayName")
    private @Nullable Output<String> customerGatewayName;

    /**
     * @return The name of the customer gateway.
     * 
     */
    public Optional<Output<String>> customerGatewayName() {
        return Optional.ofNullable(this.customerGatewayName);
    }

    /**
     * The description of the customer gateway.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the customer gateway.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The IP address of the customer gateway.
     * 
     */
    @Import(name="ipAddress", required=true)
    private Output<String> ipAddress;

    /**
     * @return The IP address of the customer gateway.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }

    /**
     * . Field &#39;name&#39; has been deprecated from provider version 1.216.0. New field &#39;customer_gateway_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated since provider version 1.210.0. New field &#39;customer_gateway_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated since provider version 1.210.0. New field 'customer_gateway_name' instead. */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return . Field &#39;name&#39; has been deprecated from provider version 1.216.0. New field &#39;customer_gateway_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated since provider version 1.210.0. New field &#39;customer_gateway_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated since provider version 1.210.0. New field 'customer_gateway_name' instead. */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * tag.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return tag.
     * 
     * The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CustomerGatewayArgs() {}

    private CustomerGatewayArgs(CustomerGatewayArgs $) {
        this.asn = $.asn;
        this.customerGatewayName = $.customerGatewayName;
        this.description = $.description;
        this.ipAddress = $.ipAddress;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomerGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerGatewayArgs $;

        public Builder() {
            $ = new CustomerGatewayArgs();
        }

        public Builder(CustomerGatewayArgs defaults) {
            $ = new CustomerGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asn Asn.
         * 
         * @return builder
         * 
         */
        public Builder asn(@Nullable Output<String> asn) {
            $.asn = asn;
            return this;
        }

        /**
         * @param asn Asn.
         * 
         * @return builder
         * 
         */
        public Builder asn(String asn) {
            return asn(Output.of(asn));
        }

        /**
         * @param customerGatewayName The name of the customer gateway.
         * 
         * @return builder
         * 
         */
        public Builder customerGatewayName(@Nullable Output<String> customerGatewayName) {
            $.customerGatewayName = customerGatewayName;
            return this;
        }

        /**
         * @param customerGatewayName The name of the customer gateway.
         * 
         * @return builder
         * 
         */
        public Builder customerGatewayName(String customerGatewayName) {
            return customerGatewayName(Output.of(customerGatewayName));
        }

        /**
         * @param description The description of the customer gateway.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the customer gateway.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ipAddress The IP address of the customer gateway.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The IP address of the customer gateway.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param name . Field &#39;name&#39; has been deprecated from provider version 1.216.0. New field &#39;customer_gateway_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated since provider version 1.210.0. New field &#39;customer_gateway_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated since provider version 1.210.0. New field 'customer_gateway_name' instead. */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name . Field &#39;name&#39; has been deprecated from provider version 1.216.0. New field &#39;customer_gateway_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated since provider version 1.210.0. New field &#39;customer_gateway_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated since provider version 1.210.0. New field 'customer_gateway_name' instead. */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags tag.
         * 
         * The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags tag.
         * 
         * The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public CustomerGatewayArgs build() {
            if ($.ipAddress == null) {
                throw new MissingRequiredPropertyException("CustomerGatewayArgs", "ipAddress");
            }
            return $;
        }
    }

}