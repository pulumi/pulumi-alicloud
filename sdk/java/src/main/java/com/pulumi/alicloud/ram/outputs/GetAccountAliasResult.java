// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountAliasResult {
    /**
     * @return Alias of the account.
     * 
     */
    private String accountAlias;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String outputFile;

    private GetAccountAliasResult() {}
    /**
     * @return Alias of the account.
     * 
     */
    public String accountAlias() {
        return this.accountAlias;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountAliasResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountAlias;
        private String id;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetAccountAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountAlias = defaults.accountAlias;
    	      this.id = defaults.id;
    	      this.outputFile = defaults.outputFile;
        }

        @CustomType.Setter
        public Builder accountAlias(String accountAlias) {
            if (accountAlias == null) {
              throw new MissingRequiredPropertyException("GetAccountAliasResult", "accountAlias");
            }
            this.accountAlias = accountAlias;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAccountAliasResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        public GetAccountAliasResult build() {
            final var _resultValue = new GetAccountAliasResult();
            _resultValue.accountAlias = accountAlias;
            _resultValue.id = id;
            _resultValue.outputFile = outputFile;
            return _resultValue;
        }
    }
}
