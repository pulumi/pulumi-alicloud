// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IpaDomainSource {
    /**
     * @return The address of the origin server. You can specify an IP address or a domain name.
     * 
     */
    private String content;
    /**
     * @return The custom port number. Valid values: `0` to `65535`.
     * 
     */
    private Integer port;
    /**
     * @return The priority of the origin server. Valid values: `20` and `30`. Default value: `20`. A value of 20 specifies that the origin is a primary origin. A value of 30 specifies that the origin is a secondary origin.
     * 
     */
    private String priority;
    /**
     * @return The type of the origin server. Valid values: `ipaddr`, `domain`, `oss`.
     * 
     */
    private String type;
    /**
     * @return The weight of the origin server. You must specify a value that is less than `100`. Default value: `10`.
     * 
     */
    private Integer weight;

    private IpaDomainSource() {}
    /**
     * @return The address of the origin server. You can specify an IP address or a domain name.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return The custom port number. Valid values: `0` to `65535`.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The priority of the origin server. Valid values: `20` and `30`. Default value: `20`. A value of 20 specifies that the origin is a primary origin. A value of 30 specifies that the origin is a secondary origin.
     * 
     */
    public String priority() {
        return this.priority;
    }
    /**
     * @return The type of the origin server. Valid values: `ipaddr`, `domain`, `oss`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The weight of the origin server. You must specify a value that is less than `100`. Default value: `10`.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpaDomainSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String content;
        private Integer port;
        private String priority;
        private String type;
        private Integer weight;
        public Builder() {}
        public Builder(IpaDomainSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.port = defaults.port;
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder content(String content) {
            if (content == null) {
              throw new MissingRequiredPropertyException("IpaDomainSource", "content");
            }
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("IpaDomainSource", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder priority(String priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("IpaDomainSource", "priority");
            }
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("IpaDomainSource", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder weight(Integer weight) {
            if (weight == null) {
              throw new MissingRequiredPropertyException("IpaDomainSource", "weight");
            }
            this.weight = weight;
            return this;
        }
        public IpaDomainSource build() {
            final var _resultValue = new IpaDomainSource();
            _resultValue.content = content;
            _resultValue.port = port;
            _resultValue.priority = priority;
            _resultValue.type = type;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
