// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.scdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainSourceArgs Empty = new DomainSourceArgs();

    @Import(name="content", required=true)
    private Output<String> content;

    public Output<String> content() {
        return this.content;
    }

    @Import(name="enabled")
    private @Nullable Output<String> enabled;

    public Optional<Output<String>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="port", required=true)
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    @Import(name="priority", required=true)
    private Output<String> priority;

    public Output<String> priority() {
        return this.priority;
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private DomainSourceArgs() {}

    private DomainSourceArgs(DomainSourceArgs $) {
        this.content = $.content;
        this.enabled = $.enabled;
        this.port = $.port;
        this.priority = $.priority;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainSourceArgs $;

        public Builder() {
            $ = new DomainSourceArgs();
        }

        public Builder(DomainSourceArgs defaults) {
            $ = new DomainSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        public Builder content(String content) {
            return content(Output.of(content));
        }

        public Builder enabled(@Nullable Output<String> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(String enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder priority(Output<String> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(String priority) {
            return priority(Output.of(priority));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DomainSourceArgs build() {
            if ($.content == null) {
                throw new MissingRequiredPropertyException("DomainSourceArgs", "content");
            }
            if ($.port == null) {
                throw new MissingRequiredPropertyException("DomainSourceArgs", "port");
            }
            if ($.priority == null) {
                throw new MissingRequiredPropertyException("DomainSourceArgs", "priority");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("DomainSourceArgs", "type");
            }
            return $;
        }
    }

}