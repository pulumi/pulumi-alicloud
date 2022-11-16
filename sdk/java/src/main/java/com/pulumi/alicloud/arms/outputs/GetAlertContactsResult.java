// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.outputs;

import com.pulumi.alicloud.arms.outputs.GetAlertContactsContact;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAlertContactsResult {
    private final @Nullable String alertContactName;
    private final List<GetAlertContactsContact> contacts;
    private final @Nullable String email;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String outputFile;
    private final @Nullable String phoneNum;

    @CustomType.Constructor
    private GetAlertContactsResult(
        @CustomType.Parameter("alertContactName") @Nullable String alertContactName,
        @CustomType.Parameter("contacts") List<GetAlertContactsContact> contacts,
        @CustomType.Parameter("email") @Nullable String email,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("phoneNum") @Nullable String phoneNum) {
        this.alertContactName = alertContactName;
        this.contacts = contacts;
        this.email = email;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.phoneNum = phoneNum;
    }

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

        public Builder() {
    	      // Empty
        }

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

        public Builder alertContactName(@Nullable String alertContactName) {
            this.alertContactName = alertContactName;
            return this;
        }
        public Builder contacts(List<GetAlertContactsContact> contacts) {
            this.contacts = Objects.requireNonNull(contacts);
            return this;
        }
        public Builder contacts(GetAlertContactsContact... contacts) {
            return contacts(List.of(contacts));
        }
        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder phoneNum(@Nullable String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }        public GetAlertContactsResult build() {
            return new GetAlertContactsResult(alertContactName, contacts, email, id, ids, nameRegex, names, outputFile, phoneNum);
        }
    }
}