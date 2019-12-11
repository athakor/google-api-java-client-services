/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * Contain information of Nat mapping for an interface of this endpoint.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VmEndpointNatMappingsInterfaceNatMappings extends com.google.api.client.json.GenericJson {

  /**
   * List of all drain IP:port-range mappings assigned to this interface. These ranges are
   * inclusive, that is, both the first and the last ports can be used for NAT. Example:
   * ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> drainNatIpPortRanges;

  /**
   * A list of all IP:port-range mappings assigned to this interface. These ranges are inclusive,
   * that is, both the first and the last ports can be used for NAT. Example:
   * ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> natIpPortRanges;

  /**
   * Total number of drain ports across all NAT IPs allocated to this interface. It equals to the
   * aggregated port number in the field drain_nat_ip_port_ranges.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numTotalDrainNatPorts;

  /**
   * Total number of ports across all NAT IPs allocated to this interface. It equals to the
   * aggregated port number in the field nat_ip_port_ranges.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numTotalNatPorts;

  /**
   * Alias IP range for this interface endpoint. It will be a private (RFC 1918) IP range. Examples:
   * "10.33.4.55/32", or "192.168.5.0/24".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceAliasIpRange;

  /**
   * Primary IP of the VM for this NIC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceVirtualIp;

  /**
   * List of all drain IP:port-range mappings assigned to this interface. These ranges are
   * inclusive, that is, both the first and the last ports can be used for NAT. Example:
   * ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDrainNatIpPortRanges() {
    return drainNatIpPortRanges;
  }

  /**
   * List of all drain IP:port-range mappings assigned to this interface. These ranges are
   * inclusive, that is, both the first and the last ports can be used for NAT. Example:
   * ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * @param drainNatIpPortRanges drainNatIpPortRanges or {@code null} for none
   */
  public VmEndpointNatMappingsInterfaceNatMappings setDrainNatIpPortRanges(java.util.List<java.lang.String> drainNatIpPortRanges) {
    this.drainNatIpPortRanges = drainNatIpPortRanges;
    return this;
  }

  /**
   * A list of all IP:port-range mappings assigned to this interface. These ranges are inclusive,
   * that is, both the first and the last ports can be used for NAT. Example:
   * ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNatIpPortRanges() {
    return natIpPortRanges;
  }

  /**
   * A list of all IP:port-range mappings assigned to this interface. These ranges are inclusive,
   * that is, both the first and the last ports can be used for NAT. Example:
   * ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
   * @param natIpPortRanges natIpPortRanges or {@code null} for none
   */
  public VmEndpointNatMappingsInterfaceNatMappings setNatIpPortRanges(java.util.List<java.lang.String> natIpPortRanges) {
    this.natIpPortRanges = natIpPortRanges;
    return this;
  }

  /**
   * Total number of drain ports across all NAT IPs allocated to this interface. It equals to the
   * aggregated port number in the field drain_nat_ip_port_ranges.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumTotalDrainNatPorts() {
    return numTotalDrainNatPorts;
  }

  /**
   * Total number of drain ports across all NAT IPs allocated to this interface. It equals to the
   * aggregated port number in the field drain_nat_ip_port_ranges.
   * @param numTotalDrainNatPorts numTotalDrainNatPorts or {@code null} for none
   */
  public VmEndpointNatMappingsInterfaceNatMappings setNumTotalDrainNatPorts(java.lang.Integer numTotalDrainNatPorts) {
    this.numTotalDrainNatPorts = numTotalDrainNatPorts;
    return this;
  }

  /**
   * Total number of ports across all NAT IPs allocated to this interface. It equals to the
   * aggregated port number in the field nat_ip_port_ranges.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumTotalNatPorts() {
    return numTotalNatPorts;
  }

  /**
   * Total number of ports across all NAT IPs allocated to this interface. It equals to the
   * aggregated port number in the field nat_ip_port_ranges.
   * @param numTotalNatPorts numTotalNatPorts or {@code null} for none
   */
  public VmEndpointNatMappingsInterfaceNatMappings setNumTotalNatPorts(java.lang.Integer numTotalNatPorts) {
    this.numTotalNatPorts = numTotalNatPorts;
    return this;
  }

  /**
   * Alias IP range for this interface endpoint. It will be a private (RFC 1918) IP range. Examples:
   * "10.33.4.55/32", or "192.168.5.0/24".
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceAliasIpRange() {
    return sourceAliasIpRange;
  }

  /**
   * Alias IP range for this interface endpoint. It will be a private (RFC 1918) IP range. Examples:
   * "10.33.4.55/32", or "192.168.5.0/24".
   * @param sourceAliasIpRange sourceAliasIpRange or {@code null} for none
   */
  public VmEndpointNatMappingsInterfaceNatMappings setSourceAliasIpRange(java.lang.String sourceAliasIpRange) {
    this.sourceAliasIpRange = sourceAliasIpRange;
    return this;
  }

  /**
   * Primary IP of the VM for this NIC.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceVirtualIp() {
    return sourceVirtualIp;
  }

  /**
   * Primary IP of the VM for this NIC.
   * @param sourceVirtualIp sourceVirtualIp or {@code null} for none
   */
  public VmEndpointNatMappingsInterfaceNatMappings setSourceVirtualIp(java.lang.String sourceVirtualIp) {
    this.sourceVirtualIp = sourceVirtualIp;
    return this;
  }

  @Override
  public VmEndpointNatMappingsInterfaceNatMappings set(String fieldName, Object value) {
    return (VmEndpointNatMappingsInterfaceNatMappings) super.set(fieldName, value);
  }

  @Override
  public VmEndpointNatMappingsInterfaceNatMappings clone() {
    return (VmEndpointNatMappingsInterfaceNatMappings) super.clone();
  }

}
