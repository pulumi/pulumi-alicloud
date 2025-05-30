// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayVpnAttachmentIkeConfig {
    /**
     * @return The authentication algorithm negotiated in the first stage. Valid values: md5, sha1, sha256, sha384, sha512. Default value: md5.
     * 
     */
    private @Nullable String ikeAuthAlg;
    /**
     * @return The encryption algorithm that is used in Phase 1 negotiations. Valid values: aes, aes192, aes256, des, and 3des. Default value: aes.
     * 
     */
    private @Nullable String ikeEncAlg;
    /**
     * @return The SA lifetime as a result of Phase 1 negotiations. Unit: seconds. Valid values: 0 to 86400. Default value: 86400.
     * 
     */
    private @Nullable Integer ikeLifetime;
    /**
     * @return IKE mode, the negotiation mode. Valid values: main and aggressive. Default value: main.
     * 
     */
    private @Nullable String ikeMode;
    /**
     * @return The Diffie-Hellman key exchange algorithm used in the first stage negotiation. Valid values: group1, group2, group5, or group14. Default value: group2.
     * 
     */
    private @Nullable String ikePfs;
    /**
     * @return The version of the IKE protocol. Value: ikev1 or ikev2. Default value: ikev1.
     * 
     */
    private @Nullable String ikeVersion;
    /**
     * @return The identifier on the Alibaba Cloud side of the IPsec connection. The length is limited to 100 characters. The default value is leftId-not-exist
     * 
     */
    private @Nullable String localId;
    /**
     * @return A pre-shared key for authentication between the VPN gateway and the local data center. The key length is 1~100 characters.
     * - If you do not specify a pre-shared key, the system randomly generates a 16-bit string as the pre-shared key.
     * - The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the on-premises data center. Otherwise, connections between the on-premises data center and the VPN gateway cannot be established.
     * 
     */
    private @Nullable String psk;
    /**
     * @return The identifier of the IPsec connection to the local data center. The length is limited to 100 characters. The default value is the IP address of the user gateway.
     * 
     */
    private @Nullable String remoteId;

    private GatewayVpnAttachmentIkeConfig() {}
    /**
     * @return The authentication algorithm negotiated in the first stage. Valid values: md5, sha1, sha256, sha384, sha512. Default value: md5.
     * 
     */
    public Optional<String> ikeAuthAlg() {
        return Optional.ofNullable(this.ikeAuthAlg);
    }
    /**
     * @return The encryption algorithm that is used in Phase 1 negotiations. Valid values: aes, aes192, aes256, des, and 3des. Default value: aes.
     * 
     */
    public Optional<String> ikeEncAlg() {
        return Optional.ofNullable(this.ikeEncAlg);
    }
    /**
     * @return The SA lifetime as a result of Phase 1 negotiations. Unit: seconds. Valid values: 0 to 86400. Default value: 86400.
     * 
     */
    public Optional<Integer> ikeLifetime() {
        return Optional.ofNullable(this.ikeLifetime);
    }
    /**
     * @return IKE mode, the negotiation mode. Valid values: main and aggressive. Default value: main.
     * 
     */
    public Optional<String> ikeMode() {
        return Optional.ofNullable(this.ikeMode);
    }
    /**
     * @return The Diffie-Hellman key exchange algorithm used in the first stage negotiation. Valid values: group1, group2, group5, or group14. Default value: group2.
     * 
     */
    public Optional<String> ikePfs() {
        return Optional.ofNullable(this.ikePfs);
    }
    /**
     * @return The version of the IKE protocol. Value: ikev1 or ikev2. Default value: ikev1.
     * 
     */
    public Optional<String> ikeVersion() {
        return Optional.ofNullable(this.ikeVersion);
    }
    /**
     * @return The identifier on the Alibaba Cloud side of the IPsec connection. The length is limited to 100 characters. The default value is leftId-not-exist
     * 
     */
    public Optional<String> localId() {
        return Optional.ofNullable(this.localId);
    }
    /**
     * @return A pre-shared key for authentication between the VPN gateway and the local data center. The key length is 1~100 characters.
     * - If you do not specify a pre-shared key, the system randomly generates a 16-bit string as the pre-shared key.
     * - The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the on-premises data center. Otherwise, connections between the on-premises data center and the VPN gateway cannot be established.
     * 
     */
    public Optional<String> psk() {
        return Optional.ofNullable(this.psk);
    }
    /**
     * @return The identifier of the IPsec connection to the local data center. The length is limited to 100 characters. The default value is the IP address of the user gateway.
     * 
     */
    public Optional<String> remoteId() {
        return Optional.ofNullable(this.remoteId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayVpnAttachmentIkeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ikeAuthAlg;
        private @Nullable String ikeEncAlg;
        private @Nullable Integer ikeLifetime;
        private @Nullable String ikeMode;
        private @Nullable String ikePfs;
        private @Nullable String ikeVersion;
        private @Nullable String localId;
        private @Nullable String psk;
        private @Nullable String remoteId;
        public Builder() {}
        public Builder(GatewayVpnAttachmentIkeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ikeAuthAlg = defaults.ikeAuthAlg;
    	      this.ikeEncAlg = defaults.ikeEncAlg;
    	      this.ikeLifetime = defaults.ikeLifetime;
    	      this.ikeMode = defaults.ikeMode;
    	      this.ikePfs = defaults.ikePfs;
    	      this.ikeVersion = defaults.ikeVersion;
    	      this.localId = defaults.localId;
    	      this.psk = defaults.psk;
    	      this.remoteId = defaults.remoteId;
        }

        @CustomType.Setter
        public Builder ikeAuthAlg(@Nullable String ikeAuthAlg) {

            this.ikeAuthAlg = ikeAuthAlg;
            return this;
        }
        @CustomType.Setter
        public Builder ikeEncAlg(@Nullable String ikeEncAlg) {

            this.ikeEncAlg = ikeEncAlg;
            return this;
        }
        @CustomType.Setter
        public Builder ikeLifetime(@Nullable Integer ikeLifetime) {

            this.ikeLifetime = ikeLifetime;
            return this;
        }
        @CustomType.Setter
        public Builder ikeMode(@Nullable String ikeMode) {

            this.ikeMode = ikeMode;
            return this;
        }
        @CustomType.Setter
        public Builder ikePfs(@Nullable String ikePfs) {

            this.ikePfs = ikePfs;
            return this;
        }
        @CustomType.Setter
        public Builder ikeVersion(@Nullable String ikeVersion) {

            this.ikeVersion = ikeVersion;
            return this;
        }
        @CustomType.Setter
        public Builder localId(@Nullable String localId) {

            this.localId = localId;
            return this;
        }
        @CustomType.Setter
        public Builder psk(@Nullable String psk) {

            this.psk = psk;
            return this;
        }
        @CustomType.Setter
        public Builder remoteId(@Nullable String remoteId) {

            this.remoteId = remoteId;
            return this;
        }
        public GatewayVpnAttachmentIkeConfig build() {
            final var _resultValue = new GatewayVpnAttachmentIkeConfig();
            _resultValue.ikeAuthAlg = ikeAuthAlg;
            _resultValue.ikeEncAlg = ikeEncAlg;
            _resultValue.ikeLifetime = ikeLifetime;
            _resultValue.ikeMode = ikeMode;
            _resultValue.ikePfs = ikePfs;
            _resultValue.ikeVersion = ikeVersion;
            _resultValue.localId = localId;
            _resultValue.psk = psk;
            _resultValue.remoteId = remoteId;
            return _resultValue;
        }
    }
}
