// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AclEntryList {
    private @Nullable String comment;
    private @Nullable String entry;

    private AclEntryList() {}
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<String> entry() {
        return Optional.ofNullable(this.entry);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclEntryList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private @Nullable String entry;
        public Builder() {}
        public Builder(AclEntryList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.entry = defaults.entry;
        }

        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder entry(@Nullable String entry) {

            this.entry = entry;
            return this;
        }
        public AclEntryList build() {
            final var _resultValue = new AclEntryList();
            _resultValue.comment = comment;
            _resultValue.entry = entry;
            return _resultValue;
        }
    }
}
