// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.outputs;

import com.pulumi.alicloud.ram.outputs.GetPolicyDocumentStatement;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicyDocumentResult {
    /**
     * @return Standard policy document rendered based on the arguments above.
     * 
     */
    private String document;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String outputFile;
    private @Nullable List<GetPolicyDocumentStatement> statements;
    private @Nullable String version;

    private GetPolicyDocumentResult() {}
    /**
     * @return Standard policy document rendered based on the arguments above.
     * 
     */
    public String document() {
        return this.document;
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
    public List<GetPolicyDocumentStatement> statements() {
        return this.statements == null ? List.of() : this.statements;
    }
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDocumentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String document;
        private String id;
        private @Nullable String outputFile;
        private @Nullable List<GetPolicyDocumentStatement> statements;
        private @Nullable String version;
        public Builder() {}
        public Builder(GetPolicyDocumentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.document = defaults.document;
    	      this.id = defaults.id;
    	      this.outputFile = defaults.outputFile;
    	      this.statements = defaults.statements;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder document(String document) {
            if (document == null) {
              throw new MissingRequiredPropertyException("GetPolicyDocumentResult", "document");
            }
            this.document = document;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPolicyDocumentResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder statements(@Nullable List<GetPolicyDocumentStatement> statements) {

            this.statements = statements;
            return this;
        }
        public Builder statements(GetPolicyDocumentStatement... statements) {
            return statements(List.of(statements));
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        public GetPolicyDocumentResult build() {
            final var _resultValue = new GetPolicyDocumentResult();
            _resultValue.document = document;
            _resultValue.id = id;
            _resultValue.outputFile = outputFile;
            _resultValue.statements = statements;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
