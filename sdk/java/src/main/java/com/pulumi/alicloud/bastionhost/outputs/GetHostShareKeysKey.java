// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHostShareKeysKey {
    /**
     * @return The first ID of the resource.
     * 
     */
    private String hostShareKeyId;
    /**
     * @return The name of the host shared key.
     * 
     */
    private String hostShareKeyName;
    /**
     * @return The ID of the Host Share Key.
     * 
     */
    private String id;
    /**
     * @return The ID of the Bastion instance.
     * 
     */
    private String instanceId;
    /**
     * @return The fingerprint of the private key.
     * 
     */
    private String privateKeyFingerPrint;

    private GetHostShareKeysKey() {}
    /**
     * @return The first ID of the resource.
     * 
     */
    public String hostShareKeyId() {
        return this.hostShareKeyId;
    }
    /**
     * @return The name of the host shared key.
     * 
     */
    public String hostShareKeyName() {
        return this.hostShareKeyName;
    }
    /**
     * @return The ID of the Host Share Key.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the Bastion instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The fingerprint of the private key.
     * 
     */
    public String privateKeyFingerPrint() {
        return this.privateKeyFingerPrint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostShareKeysKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostShareKeyId;
        private String hostShareKeyName;
        private String id;
        private String instanceId;
        private String privateKeyFingerPrint;
        public Builder() {}
        public Builder(GetHostShareKeysKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostShareKeyId = defaults.hostShareKeyId;
    	      this.hostShareKeyName = defaults.hostShareKeyName;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.privateKeyFingerPrint = defaults.privateKeyFingerPrint;
        }

        @CustomType.Setter
        public Builder hostShareKeyId(String hostShareKeyId) {
            if (hostShareKeyId == null) {
              throw new MissingRequiredPropertyException("GetHostShareKeysKey", "hostShareKeyId");
            }
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder hostShareKeyName(String hostShareKeyName) {
            if (hostShareKeyName == null) {
              throw new MissingRequiredPropertyException("GetHostShareKeysKey", "hostShareKeyName");
            }
            this.hostShareKeyName = hostShareKeyName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetHostShareKeysKey", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetHostShareKeysKey", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder privateKeyFingerPrint(String privateKeyFingerPrint) {
            if (privateKeyFingerPrint == null) {
              throw new MissingRequiredPropertyException("GetHostShareKeysKey", "privateKeyFingerPrint");
            }
            this.privateKeyFingerPrint = privateKeyFingerPrint;
            return this;
        }
        public GetHostShareKeysKey build() {
            final var _resultValue = new GetHostShareKeysKey();
            _resultValue.hostShareKeyId = hostShareKeyId;
            _resultValue.hostShareKeyName = hostShareKeyName;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.privateKeyFingerPrint = privateKeyFingerPrint;
            return _resultValue;
        }
    }
}