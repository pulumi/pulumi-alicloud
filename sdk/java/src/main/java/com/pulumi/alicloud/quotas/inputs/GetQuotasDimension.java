// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.quotas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQuotasDimension extends com.pulumi.resources.InvokeArgs {

    public static final GetQuotasDimension Empty = new GetQuotasDimension();

    @Import(name="key")
    private @Nullable String key;

    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private GetQuotasDimension() {}

    private GetQuotasDimension(GetQuotasDimension $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQuotasDimension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQuotasDimension $;

        public Builder() {
            $ = new GetQuotasDimension();
        }

        public Builder(GetQuotasDimension defaults) {
            $ = new GetQuotasDimension(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable String key) {
            $.key = key;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public GetQuotasDimension build() {
            return $;
        }
    }

}