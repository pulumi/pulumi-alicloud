// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceKeywordsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of keywords.
     * 
     */
    private List<String> ids;
    private String key;
    /**
     * @return An array that consists of reserved keywords.
     * 
     */
    private List<String> keywords;
    private @Nullable String outputFile;

    private GetInstanceKeywordsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of keywords.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public String key() {
        return this.key;
    }
    /**
     * @return An array that consists of reserved keywords.
     * 
     */
    public List<String> keywords() {
        return this.keywords;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceKeywordsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private String key;
        private List<String> keywords;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetInstanceKeywordsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.key = defaults.key;
    	      this.keywords = defaults.keywords;
    	      this.outputFile = defaults.outputFile;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInstanceKeywordsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetInstanceKeywordsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetInstanceKeywordsResult", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder keywords(List<String> keywords) {
            if (keywords == null) {
              throw new MissingRequiredPropertyException("GetInstanceKeywordsResult", "keywords");
            }
            this.keywords = keywords;
            return this;
        }
        public Builder keywords(String... keywords) {
            return keywords(List.of(keywords));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        public GetInstanceKeywordsResult build() {
            final var _resultValue = new GetInstanceKeywordsResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.key = key;
            _resultValue.keywords = keywords;
            _resultValue.outputFile = outputFile;
            return _resultValue;
        }
    }
}
