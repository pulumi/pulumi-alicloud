// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAdConnectorOfficeSitesSiteAdConnector {
    /**
     * @return AD Connector across Zones, Its Connection Addresses.
     * 
     */
    private String adConnectorAddress;
    /**
     * @return AD Connector of the State. Possible Values: Creating: in the Creation of. Connecting: Connection. Requires the User to Your Own Ad Configured on the Domain to Which. Running: Run. Expired: If You Are out-of-Date. CONNECT_ERROR: Connection Error.
     * 
     */
    private String connectorStatus;
    /**
     * @return AD Connector Mount of the Card ID.
     * 
     */
    private String networkInterfaceId;
    /**
     * @return AD Connector in the Network Corresponding to the ID of the VSwitch in.
     * 
     */
    private String vswitchId;

    private GetAdConnectorOfficeSitesSiteAdConnector() {}
    /**
     * @return AD Connector across Zones, Its Connection Addresses.
     * 
     */
    public String adConnectorAddress() {
        return this.adConnectorAddress;
    }
    /**
     * @return AD Connector of the State. Possible Values: Creating: in the Creation of. Connecting: Connection. Requires the User to Your Own Ad Configured on the Domain to Which. Running: Run. Expired: If You Are out-of-Date. CONNECT_ERROR: Connection Error.
     * 
     */
    public String connectorStatus() {
        return this.connectorStatus;
    }
    /**
     * @return AD Connector Mount of the Card ID.
     * 
     */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * @return AD Connector in the Network Corresponding to the ID of the VSwitch in.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdConnectorOfficeSitesSiteAdConnector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String adConnectorAddress;
        private String connectorStatus;
        private String networkInterfaceId;
        private String vswitchId;
        public Builder() {}
        public Builder(GetAdConnectorOfficeSitesSiteAdConnector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adConnectorAddress = defaults.adConnectorAddress;
    	      this.connectorStatus = defaults.connectorStatus;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.vswitchId = defaults.vswitchId;
        }

        @CustomType.Setter
        public Builder adConnectorAddress(String adConnectorAddress) {
            if (adConnectorAddress == null) {
              throw new MissingRequiredPropertyException("GetAdConnectorOfficeSitesSiteAdConnector", "adConnectorAddress");
            }
            this.adConnectorAddress = adConnectorAddress;
            return this;
        }
        @CustomType.Setter
        public Builder connectorStatus(String connectorStatus) {
            if (connectorStatus == null) {
              throw new MissingRequiredPropertyException("GetAdConnectorOfficeSitesSiteAdConnector", "connectorStatus");
            }
            this.connectorStatus = connectorStatus;
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceId(String networkInterfaceId) {
            if (networkInterfaceId == null) {
              throw new MissingRequiredPropertyException("GetAdConnectorOfficeSitesSiteAdConnector", "networkInterfaceId");
            }
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            if (vswitchId == null) {
              throw new MissingRequiredPropertyException("GetAdConnectorOfficeSitesSiteAdConnector", "vswitchId");
            }
            this.vswitchId = vswitchId;
            return this;
        }
        public GetAdConnectorOfficeSitesSiteAdConnector build() {
            final var _resultValue = new GetAdConnectorOfficeSitesSiteAdConnector();
            _resultValue.adConnectorAddress = adConnectorAddress;
            _resultValue.connectorStatus = connectorStatus;
            _resultValue.networkInterfaceId = networkInterfaceId;
            _resultValue.vswitchId = vswitchId;
            return _resultValue;
        }
    }
}