// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.outputs;

import com.pulumi.alicloud.arms.outputs.GetAlertContactsContact;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAlertContactsResult {
    private @Nullable String alertContactName;
    private List<GetAlertContactsContact> contacts;
    private @Nullable String email;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String phoneNum;

    private GetAlertContactsResult() {}
    public Optional<String> alertContactName() {
        return Optional.ofNullable(this.alertContactName);
    }
    public List<GetAlertContactsContact> contacts() {
        return this.contacts;
    }
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> phoneNum() {
        return Optional.ofNullable(this.phoneNum);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertContactsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String alertContactName;
        private List<GetAlertContactsContact> contacts;
        private @Nullable String email;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String phoneNum;
        public Builder() {}
        public Builder(GetAlertContactsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertContactName = defaults.alertContactName;
    	      this.contacts = defaults.contacts;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.phoneNum = defaults.phoneNum;
        }

        @CustomType.Setter
        public Builder alertContactName(@Nullable String alertContactName) {

            this.alertContactName = alertContactName;
            return this;
        }
        @CustomType.Setter
        public Builder contacts(List<GetAlertContactsContact> contacts) {
            if (contacts == null) {
              throw new MissingRequiredPropertyException("GetAlertContactsResult", "contacts");
            }
            this.contacts = contacts;
            return this;
        }
        public Builder contacts(GetAlertContactsContact... contacts) {
            return contacts(List.of(contacts));
        }
        @CustomType.Setter
        public Builder email(@Nullable String email) {

            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAlertContactsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetAlertContactsResult", "ids");
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
              throw new MissingRequiredPropertyException("GetAlertContactsResult", "names");
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
        @CustomType.Setter
        public Builder phoneNum(@Nullable String phoneNum) {

            this.phoneNum = phoneNum;
            return this;
        }
        public GetAlertContactsResult build() {
            final var _resultValue = new GetAlertContactsResult();
            _resultValue.alertContactName = alertContactName;
            _resultValue.contacts = contacts;
            _resultValue.email = email;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.phoneNum = phoneNum;
            return _resultValue;
        }
    }
}
