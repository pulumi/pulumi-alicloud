// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AliasArgs extends com.pulumi.resources.ResourceArgs {

    public static final AliasArgs Empty = new AliasArgs();

    @Import(name="accountAlias", required=true)
    private Output<String> accountAlias;

    public Output<String> accountAlias() {
        return this.accountAlias;
    }

    private AliasArgs() {}

    private AliasArgs(AliasArgs $) {
        this.accountAlias = $.accountAlias;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasArgs $;

        public Builder() {
            $ = new AliasArgs();
        }

        public Builder(AliasArgs defaults) {
            $ = new AliasArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountAlias(Output<String> accountAlias) {
            $.accountAlias = accountAlias;
            return this;
        }

        public Builder accountAlias(String accountAlias) {
            return accountAlias(Output.of(accountAlias));
        }

        public AliasArgs build() {
            if ($.accountAlias == null) {
                throw new MissingRequiredPropertyException("AliasArgs", "accountAlias");
            }
            return $;
        }
    }

}