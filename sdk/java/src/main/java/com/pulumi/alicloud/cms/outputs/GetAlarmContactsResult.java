// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.alicloud.cms.outputs.GetAlarmContactsContact;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAlarmContactsResult {
    private @Nullable String chanelType;
    private @Nullable String chanelValue;
    /**
     * @return A list of alarm contacts. Each element contains the following attributes:
     * 
     */
    private List<GetAlarmContactsContact> contacts;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of alarm contact IDs.
     * 
     */
    private List<String> ids;
    private @Nullable String nameRegex;
    /**
     * @return A list of alarm contact names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;

    private GetAlarmContactsResult() {}
    public Optional<String> chanelType() {
        return Optional.ofNullable(this.chanelType);
    }
    public Optional<String> chanelValue() {
        return Optional.ofNullable(this.chanelValue);
    }
    /**
     * @return A list of alarm contacts. Each element contains the following attributes:
     * 
     */
    public List<GetAlarmContactsContact> contacts() {
        return this.contacts;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of alarm contact IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of alarm contact names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlarmContactsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String chanelType;
        private @Nullable String chanelValue;
        private List<GetAlarmContactsContact> contacts;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        public Builder() {}
        public Builder(GetAlarmContactsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chanelType = defaults.chanelType;
    	      this.chanelValue = defaults.chanelValue;
    	      this.contacts = defaults.contacts;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
        }

        @CustomType.Setter
        public Builder chanelType(@Nullable String chanelType) {

            this.chanelType = chanelType;
            return this;
        }
        @CustomType.Setter
        public Builder chanelValue(@Nullable String chanelValue) {

            this.chanelValue = chanelValue;
            return this;
        }
        @CustomType.Setter
        public Builder contacts(List<GetAlarmContactsContact> contacts) {
            if (contacts == null) {
              throw new MissingRequiredPropertyException("GetAlarmContactsResult", "contacts");
            }
            this.contacts = contacts;
            return this;
        }
        public Builder contacts(GetAlarmContactsContact... contacts) {
            return contacts(List.of(contacts));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAlarmContactsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetAlarmContactsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetAlarmContactsResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        public GetAlarmContactsResult build() {
            final var _resultValue = new GetAlarmContactsResult();
            _resultValue.chanelType = chanelType;
            _resultValue.chanelValue = chanelValue;
            _resultValue.contacts = contacts;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            return _resultValue;
        }
    }
}
